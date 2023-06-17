package org.example.model.data;

public enum LanguageType {
    ENGLISH("english"),
    GERMAN("german"),
    SPANISH("spanish"),
    CHINESE("chinese"),
    FRENCH("french");

    private final String displayName;

    LanguageType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
