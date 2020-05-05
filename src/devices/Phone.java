package devices;

public class Phone {
    public String producer;
    public String model;
    public Double screenSize;
    public String system;

    public Phone(String producer, String model, Double screenSize, String system) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.system = system;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + system;
    }


}
