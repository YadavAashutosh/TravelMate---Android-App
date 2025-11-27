package com.example.hackathon;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BookBusActivity extends AppCompatActivity {

    private EditText etSource, etDestination, etDate, etPassengers;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_bus);

        // Initialize Views
        etSource = findViewById(R.id.et_source);
        etDestination = findViewById(R.id.et_destination);
        etDate = findViewById(R.id.et_date);
        etPassengers = findViewById(R.id.et_passengers);
        Button btnBookBus = findViewById(R.id.btn_book_bus);

        // Book Bus Button Click Event
        btnBookBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String source = etSource.getText().toString().trim();
                String destination = etDestination.getText().toString().trim();
                String date = etDate.getText().toString().trim();
                String passengers = etPassengers.getText().toString().trim();

                // Simple Validation
                if (source.isEmpty() || destination.isEmpty() || date.isEmpty() || passengers.isEmpty()) {
                    Toast.makeText(BookBusActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BookBusActivity.this, "Bus Ticket Booked!\nFrom: " + source +
                            "\nTo: " + destination + "\nDate: " + date + "\nPassengers: " + passengers, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
