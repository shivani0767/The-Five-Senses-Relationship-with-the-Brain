package com.example.shivani.the_brains_connection_to_the_five_senses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SightActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.sight_screen);
    }

    public void toMainScreen(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
