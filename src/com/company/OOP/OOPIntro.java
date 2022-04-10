package com.company.OOP;



import com.company.OOP.car.Car;
import com.company.OOP.car.Ferrari;
import com.company.OOP.car.Bugatti;

public class OOPIntro {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setBreadth(4);
        rectangle.setLength(8);

        System.out.println(rectangle.getArea() + " m2");
        System.out.println(rectangle.getPerimeter() + " m");

        Person[] people = new Person[5];
        people[0] = new Person("Olga", 35);
        people[1] = new Person("George", 20);
        people[2] = new Person("Gladys", 18);
        people[3] = new Person("Amalie", 40);
        people[4] = new Person("Clara", 6);


      Persons persons = new Persons(people);
        System.out.println(persons.getAverageAge());


        Ferrari ferrari = new Ferrari(4, "red","Turbo 3000" );

        ferrari.startEngine(true);
        ferrari.openWindowDoors();

        Bugatti bugatti = new Bugatti (4, "red", "Turbo 3000" );
        bugatti.startEngine(true);


        Animals animals = new Animals ("cow", 5);



        animals.setSounds("muu");

        animals.setMovements("stomps");
        System.out.println(animals.getType() + " says " + animals.getSounds() + " and " + animals.getMovements());

        Bird bird = new Bird("magpie", 2, "black");

        bird.howItSings("sings");
        bird.setSongSound("ha ha ha");
        System.out.println(bird.getType()+ " sings " + bird.getSongSound());


        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Olga", 30);
        employees[1] = new Employee("George", 20);
        employees[2] = new Employee("Gladys", 30);
        employees[3] = new Employee("Amalie", 40);
        employees[4] = new Employee("Clara", 60);


        Company company = new Company(employees);
        System.out.println(company.getAverageAge());




    }
    }



