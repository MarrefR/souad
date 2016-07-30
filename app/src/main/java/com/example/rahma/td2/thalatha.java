package com.example.rahma.td2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thalatha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thalatha);
    }

    public void confi(View view)
    {
        Intent intent = new Intent(thalatha.this,rabaa.class);
        startActivity(intent);

    }
}
