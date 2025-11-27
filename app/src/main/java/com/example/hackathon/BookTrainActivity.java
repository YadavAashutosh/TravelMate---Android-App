package com.example.hackathon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BookTrainActivity extends AppCompatActivity {

    private Train selectedTrain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_train);

        // Get selected train from the intent
        selectedTrain = (Train) getIntent().getSerializableExtra("train");

        TextView tvTrainDetails = findViewById(R.id.tv_train_details);
        tvTrainDetails.setText(
                "Train: " + selectedTrain.getName() +
                        "\nRoute: " + selectedTrain.getSource() + " → " + selectedTrain.getDestination() +
                        "\nTime: " + selectedTrain.getTime()
        );

        EditText etPassengerName = findViewById(R.id.et_passenger_name);
        Button btnConfirmBooking = findViewById(R.id.btn_confirm_booking);

        btnConfirmBooking.setOnClickListener(v -> {
            String passengerName = etPassengerName.getText().toString().trim();
            if (passengerName.isEmpty()) {
                Toast.makeText(BookTrainActivity.this, "Enter passenger name to book.", Toast.LENGTH_SHORT).show();
                return;
            }

            // Create a booked train object
            BookedTrain bookedTrain = new BookedTrain(
                    selectedTrain.getName(),
                    selectedTrain.getSource(),
                    selectedTrain.getDestination(),
                    selectedTrain.getTime(),
                    passengerName
            );

            // Show success message
            Toast.makeText(BookTrainActivity.this, "Train booked successfully!", Toast.LENGTH_SHORT).show();
            finish(); // Close the activity after booking
        });
    }
}
