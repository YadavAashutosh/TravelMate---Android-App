package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BookedTrainsActivity extends AppCompatActivity {

    private ArrayList<BookedTrain> bookedTrains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_booked_trains);

        bookedTrains = new ArrayList<>();  // Example booked trains list

        // Dummy booked train data
        bookedTrains.add(new BookedTrain("Train A", "Station 1", "Station 5", "10:00 AM", "John Doe"));
        bookedTrains.add(new BookedTrain("Train B", "Station 2", "Station 6", "11:00 AM", "Jane Smith"));

        ListView lvBookedTrains = findViewById(R.id.lv_booked_trains);
        BookedTrainAdapter adapter = new BookedTrainAdapter(this, bookedTrains);
        lvBookedTrains.setAdapter(adapter);
    }
}
