package com.company;

import devices.Car;
import devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    private Car car;
    private Double cash = 100.0;

    public Human() {
        super("homo sapiens");
    }

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
            double increase = salary + salaryIncrease;
            System.out.println("Nice someone increased your salary about :" + salaryIncrease + " Now you will earn :" + increase);


        }
        return salary;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) throws Exception {
        if (cash >= 0.0) {
            this.cash = cash;
        } else {
            throw new Exception("You are broke");
        }

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {

        this.car = car;


    }



    public String toString() {
        return firstName + " " + lastName;
    }

}
