package com.example.aplikasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pembayaran extends AppCompatActivity {
    Intent intent;
    int catch_harga,uangnya_user,kembalian;
    TextView tampilan_harga,kembalian_user;
    EditText uangmu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        //INISIALISASI TOTAL HARGA
        tampilan_harga = findViewById(R.id.checkout_harga);
        //INISIALISASI UANG USER
        uangmu = findViewById(R.id.uang_user);
        //INISIALISASI KEMBALIAN USER
        kembalian_user = findViewById(R.id.kembalian);

        //CATCH
        intent = getIntent();
        catch_harga = intent.getIntExtra("hello",0);
        //TAMPILKAN TOTAL
        tampilan_harga.setText(String.valueOf(catch_harga));
    }

    public void payment(View view) {
        //PARSE TO INTEGER AGAR BISA DI OPERASIKAN
        uangnya_user = Integer.parseInt(uangmu.getText().toString());
        if (uangnya_user<catch_harga){
            Toast.makeText(this, "Uang Kurang!", Toast.LENGTH_SHORT).show();
        } else {
            kembalian = uangnya_user - catch_harga;
            kembalian_user.setText(Integer.toString(kembalian));
        }
    }
}