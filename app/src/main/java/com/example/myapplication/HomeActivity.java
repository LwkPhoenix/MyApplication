package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        TextView displayUsername = findViewById(R.id.displayUsername);
        TextView displayPassword = findViewById(R.id.displayPassword);

        displayUsername.setText(username);
        displayPassword.setText(password);
    }
}