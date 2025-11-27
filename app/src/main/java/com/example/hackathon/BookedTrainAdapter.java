package com.example.hackathon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class BookedTrainAdapter extends BaseAdapter {
    private Context context;
    private List<BookedTrain> bookedTrains;

    public BookedTrainAdapter(Context context, List<BookedTrain> bookedTrains) {
        this.context = context;
        this.bookedTrains = bookedTrains;
    }

    @Override
    public int getCount() {
        return bookedTrains.size();
    }

    @Override
    public Object getItem(int position) {
        return bookedTrains.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.booked_train_item, parent, false);
        }

        BookedTrain train = bookedTrains.get(position);

        TextView tvName = convertView.findViewById(R.id.tv_booked_train_name);
        TextView tvDetails = convertView.findViewById(R.id.tv_booked_train_details);

        tvName.setText(train.getName());
        tvDetails.setText(
                "Route: " + train.getSource() + " → " + train.getDestination() +
                        "\nTime: " + train.getTime() +
                        "\nPassenger: " + train.getPassengerName()
        );

        return convertView;
    }
}
