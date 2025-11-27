package com.example.hackathon;

import java.io.Serializable;

public class Train implements Serializable {
    private String name;
    private String source;
    private String destination;
    private String time;

    public Train(String name, String source, String destination, String time) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.time = time;
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
}
