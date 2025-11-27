package com.example.hackathon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TrainAdapter extends BaseAdapter {
    private Context context;
    private List<Train> trains;

    public TrainAdapter(Context context, List<Train> trains) {
        this.context = context;
        this.trains = trains;
    }

    @Override
    public int getCount() {
        return trains.size();
    }

    @Override
    public Object getItem(int position) {
        return trains.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.train_item, parent, false);
        }

        Train train = trains.get(position);

        TextView tvName = convertView.findViewById(R.id.tv_train_name);
        TextView tvRoute = convertView.findViewById(R.id.tv_train_route);
        TextView tvTime = convertView.findViewById(R.id.tv_train_time);

        tvName.setText(train.getName());
        tvRoute.setText("Route: " + train.getSource() + " → " + train.getDestination());
        tvTime.setText("Time: " + train.getTime());

        return convertView;
    }
}
