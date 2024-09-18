package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        logoutButton = findViewById(R.id.logoutButton);
        Intent i = getIntent();
        String username = i.getStringExtra("username");
        String password = i.getStringExtra("password");

        TextView displayUsername = findViewById(R.id.displayUsername);
        TextView displayPassword = findViewById(R.id.displayPassword);

        displayUsername.setText(username);
        displayPassword.setText(password);
        logoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}