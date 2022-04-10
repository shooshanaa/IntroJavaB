package com.company.OOP;

public class Rectangle {

    private int length;
    private int breadth;


 /*   public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }*/

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public float getPerimeter() {
        return (breadth * 2) + (length * 2);
    }

    public float getArea() {
        return breadth * length;
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setBreadth(4);
        rectangle.setLength(8);

        System.out.println(rectangle.getArea() + " m2");
        System.out.println(rectangle.getPerimeter() + " m");

    }

}


