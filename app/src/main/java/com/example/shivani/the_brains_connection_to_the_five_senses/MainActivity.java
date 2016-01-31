package com.example.shivani.the_brains_connection_to_the_five_senses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSmellScreen(View view)
    {
        Intent intent = new Intent(this, SmellActivity.class);
        startActivity(intent);
    }

    public void launchHearingScreen(View view)
    {
        Intent intent = new Intent(this, HearingActivity.class);
        startActivity(intent);
    }

    public void launchTasteScreen(View view)
    {
        Intent intent = new Intent(this, TasteActivity.class);
        startActivity(intent);
    }

    public void launchSightScreen(View view)
    {
        Intent intent = new Intent(this, SightActivity.class);
        startActivity(intent);
    }

    public void launchTouchScreen(View view)
    {
        Intent intent = new Intent(this, TouchActivity.class);
        startActivity(intent);
    }
}
