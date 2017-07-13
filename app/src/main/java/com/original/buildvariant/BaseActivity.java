package com.original.buildvariant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void doMagic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
