package com.example.hackathon;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItineraryActivity extends AppCompatActivity {

    private TextView tvItineraryDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);

        tvItineraryDetails = findViewById(R.id.tv_itinerary_details);

        // Retrieve saved trip details from SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("TripDetails", MODE_PRIVATE);
        String tripDetails = sharedPreferences.getString("saved_trip", "No trips available.");

        tvItineraryDetails.setText(tripDetails);
    }
}
