package com.company;

public class Car {
    public final String model;
    public final String producer;
    public final Double firstPrice;
    public final String colour;
    public final Integer carMileage;
    public Double value = 60000.0;

    public Car(String producer, String model, Double firstPrice, String colour, Integer carMileage) {
        this.model = model;
        this.producer = producer;
        this.firstPrice = firstPrice;
        this.colour = colour;
        this.carMileage = carMileage;
    }
}
