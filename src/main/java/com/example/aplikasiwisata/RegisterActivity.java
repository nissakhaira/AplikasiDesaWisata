package com.example.aplikasiwisata;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText username, password, dob, address, phone;
    RadioGroup gender;
    Button register;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        dob = findViewById(R.id.dob);

        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        gender = findViewById(R.id.gender);
        register = findViewById(R.id.register);


        preferences = getSharedPreferences("Userinfo", 0);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameValue = username.getText().toString();
                String passwordValue = password.getText().toString();
                String dobValue = dob.getText().toString();
                String addressValue = address.getText().toString();
                String phoneValue = phone.getText().toString();
                RadioButton checkedBtn = findViewById(gender.getCheckedRadioButtonId());
                String genderValue = checkedBtn.getText().toString();

                if (usernameValue.length()>1) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("username", usernameValue);
                    editor.putString("password", passwordValue);
                    editor.putString("dob", dobValue);

                    editor.putString("address", addressValue);
                    editor.putString("phone", phoneValue);
                    editor.putString("gender", genderValue);
                    editor.apply();
                    Toast.makeText(RegisterActivity.this, "User registeres!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RegisterActivity.this, "Enter value in the fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void login(View view) {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}