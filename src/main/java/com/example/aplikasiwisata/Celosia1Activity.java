package com.example.aplikasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Celosia1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celosia1);
    }

    public void back(View view) {
        Intent intent = new Intent(Celosia1Activity.this, HomeActivity.class);
        startActivity(intent);
    }
}