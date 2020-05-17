package com.company;

import java.io.File;

public class Animal implements Saleable {
    public final String species;
    public String name;
    File pic;
    private Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 6.0;
    static final Double DEFAULT_BEAR_WEIGHT = 260.0;
    static final Double DEFAULT_SNAKE_WEIGHT = 2.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "bear" -> this.weight = DEFAULT_BEAR_WEIGHT;
            case "snake" -> this.weight = DEFAULT_SNAKE_WEIGHT;
        }
    }


    public Animal(String species, Double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("Nice thx for food, after that my weight is " + weight);


        } else {

            System.out.println("too late, sorry");

        }
    }

    void takeForAWalk() {
          weight--;
          if (weight <= 0) {
               System.out.println("walking with a dead animal is probably not normal and you can't do that");

          } else if (weight < 3) {
              System.out.println("Walk was nice but now I am hungry");

          } else {
              System.out.println("Thanks for taking me for a walk");

          }


    }

    public String toString() {
        return species + " " + weight + " " + name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

        if (buyer.getCash() >= price) {
            if (seller.pet == this) {
                seller.pet = null;
                buyer.pet = this;
                seller.setCash(seller.getCash() + price);
                buyer.setCash(buyer.getCash() - price);
                System.out.println("The sale is over, this animal is" + this + "sold to" + buyer.firstName);
            } else {
                throw new Exception("He is not yours");
            }
        } else {
            throw new Exception("Go earn more money, because now you don't have enough ");
        }
        if (this instanceof Human) {
            throw new Exception("Dude, We live in XXI centuries you can't sell humans ");
        }

    }

}




