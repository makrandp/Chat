package com.example.android.bluetoothchat;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.common.activities.SampleActivityBase;

public class StartActivity extends SampleActivityBase {

    Button enableBT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();
// work here to change Activity fragments (add, remove, etc.).  Example here of adding.
        StartLayoutFragment startLayoutFragment = new StartLayoutFragment();
        fragmentTransaction.add(R.id.activity_start,startLayoutFragment);
        fragmentTransaction.commit ();
    }
}
