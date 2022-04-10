package com.company.OOP;

public class Persons {
    private Person[] people;

    public Persons (Person[]people){
        this.people = people;

    }
    public float getAverageAge () {
        float sum = 0;

        for (Person person:people)
             {
                 sum +=person.getAge();
            
        }
        return sum/people.length;

    }

}
