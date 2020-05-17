package devices;

import com.company.Human;

public class Phone extends Device {

    public Double screenSize;
    public String system;

    public Phone(String producer, String model, Double screenSize, String system, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.screenSize = screenSize;
        this.system = system;
    }

    public String toString() {
        return super.toString() + " " + screenSize + " " + system;
    }

    @Override
    public void turnOn() {
        System.out.println("GoodMorning, You have 3 unread messages");

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.phone == this) {
                seller.phone = null;
                buyer.phone = this;
                seller.setCash(seller.getCash() + price);
                buyer.setCash(buyer.getCash() - price);
                System.out.println("The sale is over, this phone is" + this + "sold to" + buyer.firstName);
            } else {
                throw new Exception("You can sell something that is not yours");
            }
        } else {
            throw new Exception(" You don't have money for this");
        }

    }

}