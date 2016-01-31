package com.example.shivani.the_brains_connection_to_the_five_senses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shivani on 1/30/2016.
 */
public class TasteActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.taste_screen);
    }

    public void toMainScreen(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

