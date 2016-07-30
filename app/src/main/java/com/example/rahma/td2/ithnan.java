package com.example.rahma.td2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ithnan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ithnan);
    }
    public void passer(View view)
    {
        Intent intent = new Intent(ithnan.this,thalatha.class);
        startActivity(intent);

    }
}
