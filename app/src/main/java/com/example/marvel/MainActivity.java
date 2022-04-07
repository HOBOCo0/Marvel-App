package com.example.marvel;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button mIronman, mSpiderman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.heading);

        setContentView(R.layout.activity_main);

        mIronman = findViewById(R.id.ironman);
        mSpiderman = findViewById(R.id.spiderman);

        mIronman.setOnClickListener(view -> {
            Frag1 f1 = new Frag1();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.LastLayout,f1);
            transaction.commit();
        });
        mSpiderman.setOnClickListener(view -> {
            Frag2 f2 = new Frag2();
           FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
           transaction.replace(R.id.LastLayout,f2);
           transaction.commit();
        });
    }
}