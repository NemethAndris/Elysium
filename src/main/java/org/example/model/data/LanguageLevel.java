package org.example.model.data;

public enum LanguageLevel {
    BEGINNER("beginner"),

    ADVANCED("advanced"),

    PROFESSIONAL("professional"),

    NATIVE("native");


    private final String displayName;

    LanguageLevel(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
