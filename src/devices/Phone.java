package devices;

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
}