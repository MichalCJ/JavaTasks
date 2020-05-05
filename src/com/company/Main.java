package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Pug";

        Human me = new Human();
        me.firstName = "Michał";
        me.lastName = "Cięszczyk-Jaworski";

     //   me.pet = dog;
     //   me.pet.feed();
     //   me.pet.takeForAWalk();

        me.car = new Car ("Renault", "Megane", 70000.00, "celadon", 1269);
        System.out.println(me.car.producer + " " + me.car.model );



    }
}
