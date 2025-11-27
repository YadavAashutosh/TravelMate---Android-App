package com.example.hackathon;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class PlanTripActivity extends AppCompatActivity {

    private EditText etDestination, etStartDate, etEndDate;
    private Button btnSaveTrip;

    private String savedTripDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_trip);

        etDestination = findViewById(R.id.et_destination);
        etStartDate = findViewById(R.id.et_start_date);
        etEndDate = findViewById(R.id.et_end_date);
        btnSaveTrip = findViewById(R.id.btn_save_trip);

        etStartDate.setOnClickListener(v -> openDateTimePicker(etStartDate));
        etEndDate.setOnClickListener(v -> openDateTimePicker(etEndDate));

        btnSaveTrip.setOnClickListener(v -> {
            String destination = etDestination.getText().toString().trim();
            String startDate = etStartDate.getText().toString().trim();
            String endDate = etEndDate.getText().toString().trim();

            if (destination.isEmpty() || startDate.isEmpty() || endDate.isEmpty()) {
                Toast.makeText(PlanTripActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Save trip details in SharedPreferences
                savedTripDetails = "Destination: " + destination + "\nStart Date: " + startDate + "\nEnd Date: " + endDate;
                saveTripToSharedPreferences(savedTripDetails);

                Toast.makeText(PlanTripActivity.this, "Trip Plan Saved", Toast.LENGTH_SHORT).show();

                // Navigate to ItineraryActivity
                Intent intent = new Intent(PlanTripActivity.this, ItineraryActivity.class);
                startActivity(intent);
            }
        });
    }

    private void openDateTimePicker(EditText editText) {
        Calendar calendar = Calendar.getInstance();
        new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
            new TimePickerDialog(this, (timeView, hourOfDay, minute) -> {
                String dateTime = dayOfMonth + "/" + (month + 1) + "/" + year + " " + hourOfDay + ":" + minute;
                editText.setText(dateTime);
            }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true).show();
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void saveTripToSharedPreferences(String tripDetails) {
        SharedPreferences sharedPreferences = getSharedPreferences("TripDetails", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("saved_trip", tripDetails);
        editor.apply();
    }
}
