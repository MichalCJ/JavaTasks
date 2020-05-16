package devices;

public class Car extends Device {

    public final Double firstPrice;
    public final Integer carMileage;

    public Car(String producer, String model, Double firstPrice, String colour, Integer carMileage, Integer yearOfProduction) {
        super(producer, model, yearOfProduction, colour);
        this.firstPrice = firstPrice;
        this.carMileage = carMileage;
    }


    public String toString() {
        return super.toString() + " " + firstPrice + " " + carMileage;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is ready for a ride");
    }
}