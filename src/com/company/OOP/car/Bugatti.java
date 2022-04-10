package com.company.OOP.car;

public class Bugatti extends Car {

    private String color;
    private String model;

    public Bugatti (int numOfTires, String color, String model) {
        super (numOfTires);
        this.color = color;
        this.model = model;

    }


    public void startEngine (boolean key) {
        openWindowDoors();
    }

    public void openWindowDoors () {
        System.out.println("Window doors opened");
    }

}
