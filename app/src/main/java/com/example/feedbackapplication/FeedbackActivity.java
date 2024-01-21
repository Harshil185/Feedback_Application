package com.example.feedbackapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        boolean termsAgreed = intent.getBooleanExtra("CEMAIL", false);
        String radio = intent.getStringExtra("RB");
        String response = intent.getStringExtra("RESPONSE");
        float rating = intent.getFloatExtra("RATING", 0);

        TextView textViewResult = findViewById(R.id.textViewResult);
        textViewResult.setText("Name: " + name +
                "\nEmail: " + email +
                "\nTerms Agreed: " + termsAgreed +
                "\nCategory: " + radio +
                "\nResponse: " + response +
                "\nRating: " + rating );

        /*String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");

        TextView txtviewname = findViewById(R.id.displayName);
        TextView txtviewemail = findViewById(R.id.displayEmail);

        txtviewname.setText("Name : "+ name);
        txtviewemail.setText("Email : "+ email);*/
    }
}