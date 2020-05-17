package devices;

import com.company.Human;
import com.company.Saleable;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.getCar() == this) {
                seller.setCar(null);
                buyer.setCar(this);
                seller.setCash(seller.getCash() + price);
                buyer.setCash(buyer.getCash() - price);
                System.out.println("The sale is over, this car is" + this + "sold to" + buyer.firstName);
            } else {
                throw new Exception("You can sell something that is not yours");
            }
        } else {
            throw new Exception(" You don't have money for this");
        }
    }


}