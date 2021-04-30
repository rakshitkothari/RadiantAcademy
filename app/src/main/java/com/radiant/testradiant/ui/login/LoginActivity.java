package com.radiant.testradiant.ui.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.radiant.testradiant.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoginActivity extends AppCompatActivity {

    // Code for CSV File using Map
    private Map<String, String> idPassMap = new HashMap<>();

    private LoginViewModel loginViewModel;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Map<String, String> getMapFromFile(String fileName) throws IOException {
        InputStream is = getAssets().open(fileName);

        Map<String, String> idPassMapLocal;
        try (Stream<String> stream = new BufferedReader(new InputStreamReader(is)).lines()) {
            idPassMapLocal = stream
                    .filter(x -> !x.isEmpty())
                    .filter(x -> x.contains(","))
                    .collect(Collectors.toMap(
                            x -> {
                                StringTokenizer stz = new StringTokenizer(x, ",");
                                return stz.nextToken();
                            },
                            x -> {
                                StringTokenizer stz = new StringTokenizer(x, ",");
                                stz.nextToken();
                                return stz.nextToken();
                            }
                    ));
        }
        return idPassMapLocal;
    }

    public boolean login(String inputId, String inputPassword) {
        if (inputId == null || inputPassword == null) {
            return false;
        }
        if (!idPassMap.containsKey(inputId)) {
            return false;
        }
        return idPassMap.get(inputId).equals(inputPassword);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("RestrictedApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String fileName = "idpass.csv";
        try {
            idPassMap = getMapFromFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setContentView(R.layout.activity_login);
        loginViewModel = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

        final EditText usernameEditText = findViewById(R.id.username);
        final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        final ProgressBar loadingProgressBar = findViewById(R.id.loading);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Radiant Academy");

        loginViewModel.getLoginFormState().observe(this, new Observer<LoginFormState>() {
            @Override
            public void onChanged(@Nullable LoginFormState loginFormState) {
                if (loginFormState == null) {
                    return;
                }
                loginButton.setEnabled(loginFormState.isDataValid());
                if (loginFormState.getUsernameError() != null) {
                    usernameEditText.setError(getString(loginFormState.getUsernameError()));
                }
                if (loginFormState.getPasswordError() != null) {
                    passwordEditText.setError(getString(loginFormState.getPasswordError()));
                }
            }
        });

        loginViewModel.getLoginResult().observe(this, new Observer<LoginResult>() {
            @Override
            public void onChanged(@Nullable LoginResult loginResult) {
                if (loginResult == null) {
                    return;
                }
                loadingProgressBar.setVisibility(View.GONE);
                if (loginResult.getError() != null) {
                    showLoginFailed(loginResult.getError());
                }
                if (loginResult.getSuccess() != null) {
                    updateUiWithUser(loginResult.getSuccess());
                }
                setResult(Activity.RESULT_OK);

                //Complete and destroy login activity once successful
                finish();
            }
        });

        TextWatcher afterTextChangedListener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // ignore
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // ignore
            }

            @Override
            public void afterTextChanged(Editable s) {
                loginViewModel.loginDataChanged(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        };
        usernameEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    loginViewModel.login(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString());
                }
                return false;
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenForLogin(
                        usernameEditText.getText().toString(),
                        passwordEditText.getText().toString()
                );
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void OpenForLogin(String id, String pass) {
        boolean isLoginSuccessful = login(id, pass);
        if (isLoginSuccessful) {
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Login not successful", Toast.LENGTH_LONG).show();
        }
//        Intent intent = new Intent(this, NewActivity.class);
//        startActivity(intent);
    }

    private void updateUiWithUser(LoggedInUserView model) {
        String welcome = getString(R.string.welcome) + model.getDisplayName();
        // TODO : initiate successful logged in experience
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
    }

    private void showLoginFailed(@StringRes Integer errorString) {
        Toast.makeText(getApplicationContext(), errorString, Toast.LENGTH_SHORT).show();
    }
}