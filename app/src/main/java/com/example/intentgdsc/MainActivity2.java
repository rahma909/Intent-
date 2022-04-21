package com.example.intentgdsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textName,textEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textEmail= findViewById(R.id.resultEmail);

        textName=findViewById(R.id.resultName);

        Intent intent= getIntent();
        String email= intent.getStringExtra("email");
        String name= intent.getStringExtra("name");
        textEmail.setText(email);
        textName.setText(name);

    }
}