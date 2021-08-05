package com.example.projectred.model;

public enum Category {
    master_of_sport (1, "МС"),
    candidate (2, "КМС"),
    first (3, "1 разряд"),
    second (4, "2 разряд"),
    еhird (5, "3 разряд");

    private final int index;
    private final String rusName;

    Category(int index, String rusName) {
        this.index = index;
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }

    public int getIndex() {
        return index;
    }
}
