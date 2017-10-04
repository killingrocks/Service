package com.example.meoryou.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BasicsService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_service);
    }
    public void startOnClick(View view){
        startService(new Intent(getBaseContext(), ThisService.class));
    }

    public void stopOnClick(View view){
        stopService(new Intent(getBaseContext(), ThisService.class));
    }

}
