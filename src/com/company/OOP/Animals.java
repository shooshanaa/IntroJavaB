package com.company.OOP;

public class Animals {
    private String type;
    private int numberOfLegs;
    private String sounds;
    private String movements;

    public Animals (String type, int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSounds() {
        return sounds;
    }

    public void setSounds(String sounds) {
        this.sounds = sounds;
    }

    public String getMovements() {
        return movements;
    }

    public void setMovements(String movements) {
        this.movements = movements;
    }
}
