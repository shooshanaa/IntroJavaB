package com.company.OOP;

public class Person {
    private String name;
    private int age;


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

    public double bmi (double height, double weight){
     return weight/(Math.pow(height, 2));

    }

    public static void main(String[] args) {
        Person luize = new Person ("Luize", 28);
        luize.getName();
        System.out.println(luize.getName());

        System.out.println("Your bmi is " + luize.bmi(1.65,66));

    }

}



