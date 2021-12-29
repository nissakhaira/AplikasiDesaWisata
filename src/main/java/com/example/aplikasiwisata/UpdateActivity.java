package com.example.aplikasiwisata;


import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {
    EditText username, password;
    Button update, cancel;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        update = findViewById(R.id.update);
        cancel = findViewById(R.id.cancel);

        preferences = getSharedPreferences("UserInfo", 0);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameValue = username.getText().toString();
                String passwordValue = password.getText().toString();

                if (usernameValue.length()>1) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("username", usernameValue);
                    editor.putString("password", passwordValue);
                    editor.apply();
                    Toast.makeText(UpdateActivity.this, "User updated!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(UpdateActivity.this, "Enter value in the fields!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancel.setOnClickListener((v) -> {
            emptyField();
        });
    }
    public void emptyField(){
        username.setText("");
        password.setText("");
    }
}