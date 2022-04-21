package com.example.intentgdsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button buttonImplicit,buttonexplicit,buttonCall,button;
    EditText editemail,editname,editPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       buttonImplicit = findViewById(R.id.btnImplicit);
       buttonexplicit= findViewById(R.id.btnexplicit);
       buttonCall=findViewById(R.id.btnCall);
       editemail=findViewById(R.id.emailId);
       editname=findViewById(R.id.nameId);
       editPhone=findViewById(R.id.phoneID);
       button=findViewById(R.id.btn);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent= new Intent(MainActivity.this,MainActivity2.class);
               startActivity(intent);
           }
       });

       buttonImplicit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Uri uri= Uri.parse("https://www.google.com/");
               Intent intent= new Intent(Intent.ACTION_VIEW,uri);
               startActivity(intent);
           }
       });

       buttonCall.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String phoneNum= editPhone.getText().toString();

               Intent intentCall= new Intent(Intent.ACTION_DIAL);
               intentCall.setData(Uri.parse("tel:"+phoneNum));
               startActivity(intentCall);
           }
       });

        buttonexplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                String email= editemail.getText().toString();
                String name= editname.getText().toString();
                i.putExtra("email",email);
                i.putExtra("name",name);
                startActivity(i);
            }
        });
    }
}