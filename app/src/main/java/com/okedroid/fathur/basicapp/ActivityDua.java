package com.okedroid.fathur.basicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivityDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);


    }

        public void pindahLayarKiri(View view) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);

            overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);

        }

        public void pindahLayarKanan(View view) {
            Intent i = new Intent(getApplicationContext(), ActivityTiga.class);
            startActivity(i);

            overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
        }

    }


