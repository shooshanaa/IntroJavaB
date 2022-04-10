package com.company.OOP.car;

public class Ferrari extends Car {
    private String color;

    private String model;


    public Ferrari (int numOfTires, String color, String model) {
        super (numOfTires);
        this.color = color;
        this.model = model;

    }


    public void startEngine () {

        System.out.println("Ferrari engine started");

            }

    public void openWindowDoors () {
        System.out.println("Window Doors opened");
    }

}
