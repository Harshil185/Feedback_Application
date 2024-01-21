package com.example.feedbackapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    EditText eName, eEmail, eResponse;
    CheckBox cemail;
    RadioGroup RG;
    RadioButton RB;
    RatingBar star;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.editText);
        eEmail = findViewById(R.id.editEmail);
        cemail = findViewById(R.id.chk_email);
        RG = findViewById(R.id.rg_cate);
        eResponse = findViewById(R.id.editResponse);
        star = findViewById(R.id.ratingBar);
    }

    public void submit(View view) {

        String name = eName.getText().toString();
        String email = eEmail.getText().toString();
        boolean checkb = cemail.isChecked();
        RadioButton selectedRadioButton = findViewById(RG.getCheckedRadioButtonId());
        String rb = selectedRadioButton.getText().toString();
        String response = eResponse.getText().toString();
        float rating = star.getRating();

        Intent obj = new Intent(this, FeedbackActivity.class);
        obj.putExtra("NAME",name);
        obj.putExtra("EMAIL",email);
        obj.putExtra("CEMAIL",checkb);
        obj.putExtra("RB",rb);
        obj.putExtra("RESPONSE",response);
        obj.putExtra("RATING",rating);

        startActivity(obj);
    }
}