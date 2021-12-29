package com.example.aplikasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {
    TextView harga_total;
    int harga = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        harga_total = findViewById(R.id.hasil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_call:
                displayToast("You selected Call Center");
                return true;
            case R.id.action_sms:
                displayToast("You selected SMS Center");
                return true;
            case R.id.action_maps:
                displayToast("You selected Maps");
                return true;
            case R.id.action_akun:
                // Starts update activity.
                Intent intent = new Intent(getBaseContext(), com.example.aplikasiwisata.UpdateActivity.class);
                startActivity(intent);
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayToast (String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void menu1(View view) {
        harga += 10000;
        harga_total.setText(Integer.toString(harga));
    }
    public void menu2(View view) {
        harga += 15000;
        harga_total.setText(Integer.toString(harga));
    }
    public void menu3(View view) {
        harga += 20000;
        harga_total.setText(Integer.toString(harga));
    }
    public void menu4(View view) {
        harga += 25000;
        harga_total.setText(Integer.toString(harga));
    }
    public void menu5(View view) {
        harga += 7500;
        harga_total.setText(Integer.toString(harga));
    }
    public void menu6(View view) {
        harga += 25000;
        harga_total.setText(Integer.toString(harga));
    }

    public void checkout(View view) {
        Intent intent = new Intent(HomeActivity.this, Pembayaran.class);
        intent.putExtra("hello",harga);
        startActivity(intent);
    }

    public void deskripsi1(View view) {
        Intent intent = new Intent(HomeActivity.this, UmbulActivity.class);
        startActivity(intent);
    }
    public void deskripsi2(View view) {
        Intent intent = new Intent(HomeActivity.this, Celosia1Activity.class);
        startActivity(intent);
    }
    public void deskripsi3(View view) {
        Intent intent = new Intent(HomeActivity.this, Celosia2Activity.class);
        startActivity(intent);
    }
    public void deskripsi4(View view) {
        Intent intent = new Intent(HomeActivity.this, Celosia3Activity.class);
        startActivity(intent);
    }
    public void deskripsi5(View view) {
        Intent intent = new Intent(HomeActivity.this, SetyaAjiActivity.class);
        startActivity(intent);
    }
    public void deskripsi6(View view) {
        Intent intent = new Intent(HomeActivity.this, SusanSpaActivity.class);
        startActivity(intent);
    }
}