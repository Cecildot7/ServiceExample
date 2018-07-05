package com.example.cecildot.serviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnstart,btnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstart = (Button) findViewById(R.id.btnstart);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callservice = new Intent(MainActivity.this,MyService.class);
                startService(callservice);
            }
        });
        btnstop = (Button) findViewById(R.id.btnstop);
        Intent callservice = new Intent(MainActivity.this,MyService.class);
        stopService(callservice);


    }
}
