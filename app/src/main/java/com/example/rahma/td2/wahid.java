package com.example.rahma.td2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class wahid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahid);
    }


    public void connec(View view)
    {
        Intent intent = new Intent(wahid.this,ithnan.class);
        startActivity(intent);

    }
}
