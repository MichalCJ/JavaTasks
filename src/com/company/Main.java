package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 6.0, "Pug");
        dog.name = "Pug";

        Human mcj = new Human("Michał", "Cięszczyk-Jaworski");

        mcj.pet = dog;
        //   mcj.pet.feed();
        //   mcj.pet.takeForAWalk();

        mcj.setCar(new Car("Renault", "Megane", 70000.00, "celadon", 1269, 2012));
        System.out.println(mcj.getCar().producer + " " + mcj.getCar().model + " " + mcj.getCar().colour + " " + mcj.getCar().yearOfProduction);

        System.out.println("My money is :" + mcj.getSalary());

        mcj.setSalary(1500.0);

        Phone mobile = new Phone("Xiaomi", "S1", 6.0, "android", 2020, "White");
        mcj.phone = mobile;
        System.out.println(mobile);
        System.out.println(mcj);
        //System.out.println(Car);

        System.out.println(dog);

    }
}
