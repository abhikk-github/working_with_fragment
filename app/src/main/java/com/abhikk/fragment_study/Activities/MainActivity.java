package com.abhikk.fragment_study.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import com.abhikk.fragment_study.Fragment.oneFragment;
import com.abhikk.fragment_study.Fragment.splashFragment;
import com.abhikk.fragment_study.Fragment.twoFragment;
import com.abhikk.fragment_study.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splashFragment splashFragment = new splashFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.frame_main, splashFragment).commit();

        gotoNextFragment();

    }

    private void gotoNextFragment() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                oneFragment oneFragment = new oneFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_main, oneFragment).commit();

            }
        }, 5000);
    }
}