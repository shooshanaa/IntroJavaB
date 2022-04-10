package com.company.OOP;

public class Person {
    private String name;
    private int age;
    private float heigth;
    private float weigth;


public Person (String name, int age){

this.name = name;
this.age = age;

}

public String getName (){
    return name;
}

public void setName (String name) {
    this.name = name;
}
public int getAge (){
    return age;
    }

    public void setAge (int age){
    this.age = age;
    }

    public void changeAge (){
    age++;

    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public float getBMI() {
    return weigth/(heigth*heigth);

    }



  /*  public double bmi (double height, double weight){
     return weight/(Math.pow(height, 2));

    }*/

    public static void main(String[] args) {
        Person luize = new Person ("Luize", 28);
        luize.getName();
        System.out.println(luize.getName());

 //       System.out.println("Your bmi is " + luize.bmi(1.65,66));

        luize.setHeigth(1.65f);
        luize.setWeigth (65);

        System.out.println(luize.getBMI());

    }

}



