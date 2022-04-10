package com.company.OOP;

public class Company {
    private Employee[] employees;

    public Company (Employee[] employees) {
        this.employees = employees;
    }

    public float getAverageAge () {
        float sum = 0;

        for (Person person:employees)
        {
            sum +=person.getAge();

        }
        return sum/ employees.length;

    }
}
