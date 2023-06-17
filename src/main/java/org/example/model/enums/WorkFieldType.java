package org.example.model.enums;

public enum WorkFieldType {
    IT("Information Technology"),
    Finance("Finance"),
    Marketing("Marketing"),
    Sales("Sales"),
    Engineering("Engineering");


    private final String displayName;

    WorkFieldType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
