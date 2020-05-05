package com.company;

import java.io.File;

public class Animal {
     final String species;
     private Double weight;
     String name;
     File pic;
     static final Double DEFAULT_DOG_WEIGHT = 6.0;
     static final Double DEFAULT_BEAR_WEIGHT = 260.0;
     static final Double DEFAULT_SNAKE_WEIGHT = 2.0;

     public Animal(String species){
          this.species = species;
          switch (species){
               case "dog":
                    this.weight = DEFAULT_DOG_WEIGHT;
                    break;
               case "bear":
                    this.weight = DEFAULT_BEAR_WEIGHT;
                    break;
               case "snake":
                    this.weight = DEFAULT_SNAKE_WEIGHT;
                    break;
          }
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
}




