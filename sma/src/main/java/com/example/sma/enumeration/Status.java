package com.example.sma.enumeration;

// The Status enumeration defines possible server statuses in the application.

public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    // Constructor for the Status enum.
    Status(String status) {
        this.status = status;
    }

    // Getter method to retrieve the status string.
    public String getStatus() {
        return this.status;
    }
}
