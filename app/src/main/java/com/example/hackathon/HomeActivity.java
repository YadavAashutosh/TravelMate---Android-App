package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button btnPlanTrip, btnViewItinerary, btnBookTrain, btnBookBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize Buttons
        btnPlanTrip = findViewById(R.id.btn_plan_trip);
        btnViewItinerary = findViewById(R.id.btn_view_itinerary);
        btnBookTrain = findViewById(R.id.btn_book_train);
        btnBookBus = findViewById(R.id.btn_book_bus);

        // Navigate to PlanTripActivity
        btnPlanTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PlanTripActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to ItineraryActivity
        btnViewItinerary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ItineraryActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to BookTrainActivity
        btnBookTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BookTrainActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to BookBusActivity
        btnBookBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BookBusActivity.class);
                startActivity(intent);
            }
        });
    }
}
