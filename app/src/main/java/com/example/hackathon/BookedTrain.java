package com.example.hackathon;

import java.io.Serializable;

public class BookedTrain implements Serializable {
    private String name;
    private String source;
    private String destination;
    private String time;
    private String passengerName;

    public BookedTrain(String name, String source, String destination, String time, String passengerName) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.passengerName = passengerName;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    public String getPassengerName() {
        return passengerName;
    }
}
