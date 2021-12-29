package com.example.aplikasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SetyaAjiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setya_aji);
    }

    public void back(View view) {
        Intent intent = new Intent(SetyaAjiActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}