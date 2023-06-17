package org.example.model.enums;

public enum Direction {
    LEFT("left"),

    RIGHT("right");


    private final String displayName;

    Direction(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
