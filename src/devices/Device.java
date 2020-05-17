package devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public final String model;
    public final String producer;
    public final String colour;
    public final Integer yearOfProduction;
    public Double value = 1000.0;

    public Device(String producer, String model, Integer yearOfProduction, String colour) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract void turnOn();
}
