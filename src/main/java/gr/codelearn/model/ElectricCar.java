package gr.codelearn.model;

public class ElectricCar extends Car {

    private String battery;
    private Color color;

    public ElectricCar(String name, String model, String battery) {
        super(name, model);
        this.battery = battery;
    }

    public ElectricCar(Color color) {
        this.color = color;
    }

    public void move() {
        super.move();
        System.out.println("electric car moving");
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
