package com.example.projectred.model;

public enum Sex {
    man(1, "мужской"),
    woman(2, "женский");

    private final int index;
    private final String rusName;

    Sex(int index, String rusName) {
        this.index = index;
        this.rusName = rusName;
    }

    public int getIndex() {
        return index;
    }

    public String getRusName() {
        return rusName;
    }
}
