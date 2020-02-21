package com.prashant.bucky.commercia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.prashant.bucky.commercia.Accounts_11.Accounts11;
import com.prashant.bucky.commercia.Accounts_12.Accounts12;
import com.prashant.bucky.commercia.Business_11.Business11;
import com.prashant.bucky.commercia.Business_12.Business12;
import com.prashant.bucky.commercia.Economics_11.Economics11;
import com.prashant.bucky.commercia.Economics_12.Economics12;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//BUTTONS OF ALL CLASS
        Button btn = (Button) findViewById(R.id.eco_11);
        Button btn1 = (Button) findViewById(R.id.acc_11);
        Button btn2 = (Button) findViewById(R.id.bus_11);
        Button btn3 = (Button) findViewById(R.id.eco_12);
        Button btn4 = (Button) findViewById(R.id.acc_12);
        Button btn5 = (Button) findViewById(R.id.bus_12);

 //CALLING ACTIVITY WHICH HAVE VIDEO LIST
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Economics11.class);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Accounts11.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Business11.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Economics12.class);
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Accounts12.class);
                startActivity(i);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Business12.class);
                startActivity(i);
            }
        });

//THE END OF CALLING ACTIVITY FROM FIRST ACTIVITY
    }
}
