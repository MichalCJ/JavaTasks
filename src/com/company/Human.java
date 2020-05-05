package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    Car car;

    private final Double salaryIncrease = 150.0;
    private Double salary = 1500.0;

    public Double getSalary() {
        Date currentDate = new Date();
        SimpleDateFormat lastSDF = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        System.out.println("Your salary was sent: " + lastSDF.format(currentDate));
        System.out.println("Your last salary was:" + salary);

        return salary;
    }

    public Double setSalary(Double salary) {
        this.salary = salary + salaryIncrease;
        if (salary < 0) {
            System.out.println(("You moron you know you can't do that?"));
        } else {
            System.out.println("New data about your salary has been sent to the accounting system");
            System.out.println("You must collect the annex from the contract. To do this, go to Mrs. Hania from the cadres");
            System.out.println("You fool you can't hide from ZUS and US. They already know about the change in your pay and you have nothing to hide");
            Double increase = salary + salaryIncrease;
            System.out.println("Nice someone increased your salary about :" + salaryIncrease + " Now you will earn :" + increase);


        }
        return salary;
    }

}
