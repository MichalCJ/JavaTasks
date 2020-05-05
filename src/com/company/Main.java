package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Pug";

        Human mcj = new Human();
        mcj.firstName = "Michał";
        mcj.lastName = "Cięszczyk-Jaworski";

        //   mcj.pet = dog;
        //   mcj.pet.feed();
        //   mcj.pet.takeForAWalk();

        mcj.setCar(new Car("Renault", "Megane", 70000.00, "celadon", 1269));
        System.out.println(mcj.getCar().producer + " " + mcj.getCar().model);

        System.out.println("My money is :" + mcj.getSalary());

        mcj.setSalary(1500.0);

    }
}
