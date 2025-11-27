package com.example.hackathon;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ViewBookedTrainsActivity extends AppCompatActivity {

    private List<BookedTrain> bookedTrains = new ArrayList<>();
    private BookedTrainAdapter bookedTrainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_booked_trains);

        // Get the list of booked trains passed from BookedTrainsActivity
        bookedTrains = (List<BookedTrain>) getIntent().getSerializableExtra("bookedTrains");

        // Initialize the ListView to show the booked trains
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView lvBookedTrains = findViewById(R.id.lv_view_booked_trains);
        bookedTrainAdapter = new BookedTrainAdapter(this, bookedTrains);
        lvBookedTrains.setAdapter(bookedTrainAdapter);
    }
}
