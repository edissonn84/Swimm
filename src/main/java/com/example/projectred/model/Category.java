package com.example.projectred.model;

public enum Category {
    master_of_sport (1, "МС"),
    candidate (2, "КМС"),
    first (3, "1 разряд"),
    second (4, "2 разряд"),
    third (5, "3 разряд");

    private final int indexC;
    private final String rusNameC;

    Category(int indexC, String rusNameC) {
        this.indexC = indexC;
        this.rusNameC = rusNameC;
    }

    public int getIndexC() {
        return indexC;
    }

    public String getRusNameC() {
        return rusNameC;
    }
}
