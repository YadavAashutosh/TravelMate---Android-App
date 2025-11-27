package com.example.hackathon;


import java.util.ArrayList;
import java.util.List;

public class TrainData {
    public static List<Train> getTrainList() {
        List<Train> trains = new ArrayList<>();

        trains.add(new Train("Train A", "Station 1", "Station 5", "10:00 AM"));
        trains.add(new Train("Train B", "Station 2", "Station 6", "11:00 AM"));
        trains.add(new Train("Train C", "Station 3", "Station 7", "12:00 PM"));
        trains.add(new Train("Train D", "Station 4", "Station 8", "01:00 PM"));
        trains.add(new Train("Train E", "Station 1", "Station 6", "02:00 PM"));
        trains.add(new Train("Train F", "Station 2", "Station 7", "03:00 PM"));
        trains.add(new Train("Train G", "Station 3", "Station 8", "04:00 PM"));
        trains.add(new Train("Train H", "Station 4", "Station 1", "05:00 PM"));
        trains.add(new Train("Train I", "Station 2", "Station 3", "06:00 PM"));
        trains.add(new Train("Train J", "Station 1", "Station 4", "07:00 PM"));
        trains.add(new Train("Train K", "Station 5", "Station 6", "08:00 PM"));
        trains.add(new Train("Train L", "Station 7", "Station 8", "09:00 PM"));

        return trains;
    }
}

