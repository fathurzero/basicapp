package com.okedroid.fathur.basicapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

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

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            //super.onBackPressed();

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
            startActivity(intent);
            finish();
            System.exit(0);
            return;
        }
//fitur back dua kali keluar langsung ke home
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
