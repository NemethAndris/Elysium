package org.example.model.enums;

public enum Status {
    MATCHED("matched"),
    HIRED("hired");

 ;
    private final String displayName;

    Status(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
