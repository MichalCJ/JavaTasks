package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    private Car car;

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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary >= car.value) {
            System.out.println("Nice, you are enough rich to buy a car");
            this.car = car;

        } else if (this.salary * 12 >= car.value) {
            System.out.println("Well this isn't your biggest success but you bought car on credit");
            this.car = car;

        } else {
            System.out.println("Dude you are too poor to buy a car. Go work on yourself to be able to buy that car");
        }
    }
}
