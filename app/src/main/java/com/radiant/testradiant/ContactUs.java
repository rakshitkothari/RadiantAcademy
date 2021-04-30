package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactUs extends AppCompatActivity {
    EditText etName, etEaddress, etSubject, etMessage;
    Button btsend;
    String sEmail, sPassword;
    ImageView youtube;
    ImageView facebook;
    ImageView instagram;
    ImageView twitter;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        youtube = findViewById(R.id.youtube);
        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);
        twitter = findViewById(R.id.twitter);


        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/results?search_query=the+radiant+academy");
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrlFacebook("https://www.facebook.com/Theradiantacademy1/");
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrlInstagram("https://www.instagram.com/theradiantacademy/");
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrlTwitter("https://twitter.com/theradiantacad1");
            }
        });


        // DIRECT gmail OPENS

//        final Intent intent = new Intent(android.content.Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        final PackageManager pm = getPackageManager();
//        final List<ResolveInfo> matches = ((PackageManager) pm).queryIntentActivities(intent, 0);
//        ResolveInfo best = null;
//        for (final ResolveInfo info : matches)
//            if (info.activityInfo.packageName.endsWith(".gm") ||
//                    info.activityInfo.name.toLowerCase().contains("gmail")) best = info;
//        if (best != null)
//            intent.setClassName(best.activityInfo.packageName, best.activityInfo.name);
//        startActivity(intent);

        // SEND button click implementation


//        etName = findViewById(R.id.edit_text_name);
//        etEaddress = findViewById(R.id.edit_text_email);
//        etSubject = findViewById(R.id.edit_text_subject);
//        etMessage = findViewById(R.id.edit_text_message);
//        btsend = findViewById(R.id.button_send);
//
//        sEmail = "rakshit007kothari@gmail.com";
//        sPassword = "12345";
//        btsend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Properties properties = new Properties();
//                properties.put("mail.smtp.auth", "true");
//                properties.put("mail.smtp.host", "true");
//                properties.put("mail.smtp.host", "smtp.gmail.com");
//                properties.put("mail.smtp.port", "587");
//
//                Session session = Session.getDefaultInstance(properties, new Authenticator() {
//                    @Override
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(sEmail, sPassword);
//                    }
//                });
//
//
//                try {
//                    Message message = new MimeMessage(session);
//                    message.setFrom(new InternetAddress(sEmail));
//
//                    // Name
//                    message.setText(etName.getText().toString().trim());
//                    InternetAddress.parse(etName.getText().toString().trim());
//                    // Email
//                    message.setRecipients(Message.RecipientType.TO,
//                            InternetAddress.parse(etEaddress.getText().toString().trim()));
//                    // Subject
//                    message.setSubject(etSubject.getText().toString().trim());
//                    //Message
//                    message.setText(etMessage.getText().toString().trim());
//
//                    // Send Email
//                    new SendMail().execute(message);
//
//
//                } catch (MessagingException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//        });
//
//
////        Button button = findViewById(R.id.button_send);
////        button.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
////
////            }
////        });
//
//    }
//
//    private class SendMail extends AsyncTask<Message, String, String> {
//        private ProgressDialog progressDialog;
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            // Create and show progress dialogue
//            progressDialog = ProgressDialog.show(ContactUs.this, "Please Wait", "Sending Mail", true, false);
//        }
//
//
//        @Override
//        protected String doInBackground(Message... messages) {
//            try {
//                // When Succedded
//                Transport.send(messages[0]);
//                return "Success";
//            } catch (MessagingException e) {
//                // When Error
//
//                e.printStackTrace();
//                return "Error";
//            }
//
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            //Dismiss progress Dialogue
//
//            progressDialog.dismiss();
//            if (s.equals("Success")) {
//                // When Success
//
//
//                //Initialize alert dialogue
//                AlertDialog.Builder builder = new AlertDialog.Builder(ContactUs.this);
//                builder.setCancelable(false);
//                builder.setTitle(Html.fromHtml("<font color = '#509324'>Success</font>"));
//                builder.setMessage("Mail sent successufully");
//                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.dismiss();
//                        //Clear all edit Text
//                        etName.setText("");
//                        etEaddress.setText("");
//                        etMessage.setText("");
//                        etSubject.setText("");
//                    }
//                });
//                // Show alert dialog
//                builder.show();
//            } else {
//                //when error
//
//                Toast.makeText(getApplicationContext()
//                        , "Something went wrong?", Toast.LENGTH_SHORT).show();
//
//
//            }
//        }

    }

    public void gmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "contact@theradiantacademy.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    private void gotoUrlFacebook(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    private void gotoUrlInstagram(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    private void gotoUrlTwitter(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


}