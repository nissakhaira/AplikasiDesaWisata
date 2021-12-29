package com.example.aplikasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SusanSpaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_susan_spa);
    }

    public void back(View view) {
        Intent intent = new Intent(SusanSpaActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}