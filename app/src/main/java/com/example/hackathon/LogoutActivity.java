package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Clear user session or perform logout cleanup here
        // Example: Clearing shared preferences

        // Navigate back to MainActivity (Login Page)
        Intent intent = new Intent(LogoutActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clear back stack
        intent.putExtra("isSignedOut", true); // Flag to show signout message
        startActivity(intent);

        finish(); // Finish LogoutActivity
    }
}
