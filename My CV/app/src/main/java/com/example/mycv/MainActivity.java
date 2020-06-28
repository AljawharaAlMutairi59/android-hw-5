package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String name1 = "MyCVName";
    public static final String age1 = "MyCVAge";
    public static final String job1 = "MyCVJob";
    public static final String phone1 = "MyCVPhone";
    public static final String email1 = "MyCVEmail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button next =  (Button) findViewById(R.id.button);
         next.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openActivity2();
             }
         });


    }
    public void openActivity2(){

        EditText thename = (EditText) findViewById(R.id.name);
        String n = thename.getText().toString();

        EditText theage = (EditText) findViewById(R.id.age);
        int a = Integer.parseInt(theage.getText().toString());

        EditText thejob = (EditText) findViewById(R.id.job);
        String j = thejob.getText().toString();

        EditText thephone = (EditText) findViewById(R.id.phone);
        int ph = Integer.parseInt(thephone.getText().toString());

        EditText theemail = (EditText) findViewById(R.id.email);
        String e = theemail.getText().toString();


        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(name1, n);
        i.putExtra(age1, a);
        i.putExtra(job1, j);
        i.putExtra(phone1, ph);
        i.putExtra(email1, e);
        startActivity(i);


    }

}