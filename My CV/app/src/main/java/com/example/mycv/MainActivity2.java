package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i =getIntent();
        String n = i.getStringExtra(MainActivity.name1);
        int a = i.getIntExtra(MainActivity.age1,0);
        String j =i.getStringExtra(MainActivity.job1);
        int ph = i.getIntExtra(MainActivity.phone1,0);
        String e = i.getStringExtra(MainActivity.email1);

        TextView myName = (TextView) findViewById(R.id.myname);
        TextView myAge = (TextView) findViewById(R.id.myage);
        TextView myJob = (TextView) findViewById(R.id.myjob);
        final TextView myNumber = (TextView) findViewById(R.id.mynumber);
        final TextView myEmail = (TextView) findViewById(R.id.myemail);

        myName.setText("My Name : "+n);
        myAge.setText("Age : "+a);
        myJob.setText("My Job : "+ j);
        myNumber.setText("Phone Number : "+ ph);
        myEmail.setText("My E-mail: "+e);


        Button call = findViewById(R.id.callbutton);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = myNumber.getText().toString();

                String y ="Tel :" + x;
                Intent z = new Intent(Intent.ACTION_CALL);
                z.setData(Uri.parse(y));
                startActivity(z);




            }
        });

    }
}