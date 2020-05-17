package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 6.0, "Pug");
        dog.name = "Pug";

        Human mcj = new Human();
        mcj.firstName = "Michał";
        mcj.lastName = "Cięszczyk-Jaworski";

        Human dude = new Human();
        dude.firstName = "Zbigniew";
        dude.lastName = "Duduś";

        dude.setCar(new Car("Skoda", "Octavia", 30000.00, "blue", 333, 2019));

        Car van = new Car("Skoda", "Octavia", 20000.00, "green", 666, 2018);


        mcj.pet = dog;
        //   mcj.pet.feed();
        //   mcj.pet.takeForAWalk();


        mcj.setCar(new Car("Renault", "Megane", 70000.00, "celadon", 1269, 2012));
        //  System.out.println(mcj.getCar().producer + " " + mcj.getCar().model + " " + mcj.getCar().colour + " " + mcj.getCar().yearOfProduction);

        //   System.out.println("My money is :" + mcj.getSalary());

        //   mcj.setSalary(1500.0);

        Phone mobile = new Phone("Xiaomi", "S1", 6.0, "android", 2020, "White");
        mcj.phone = mobile;
        //    System.out.println(mobile);
        //   System.out.println(mcj);
        // System.out.println(Car);
        //  System.out.println(dog);

        mobile.turnOn();

        van.turnOn();

        try {
            dude.getCar().sell(dude, mcj, 69.00);

            mcj.pet.sell(mcj, dude, 10.00);

            mcj.phone.sell(mcj, dude, 22.00);

        } catch (Exception a) {

            a.printStackTrace();
        }

        System.out.println("mcj.phone " + mcj.phone);
        System.out.println("dude.phone " + dude.phone);

        System.out.println("mcj.cash " + mcj.getCash());
        System.out.println("dude.cash " + dude.getCash());

        System.out.println("mcj.pet " + mcj.pet);
        System.out.println("dude.pet " + dude.pet);

        System.out.println(" mcj.car " + mcj.getCar());
        System.out.println("dude.car " + dude.getCar());

    }
}
