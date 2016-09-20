package com.okedroid.fathur.basicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityTiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);


    }
    public void pindahLayarKiri(View view) {
        Intent i = new Intent(getApplicationContext(), ActivityDua.class);
        startActivity(i);

        overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);


    }
    }

