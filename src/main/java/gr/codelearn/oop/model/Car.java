package gr.codelearn.oop.model;

public class Car implements Vehicle {
    private String name;
    private String model;

    public Car() {
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void move(){
        System.out.println("car moving");
    }

    @Override
    public void stop() {
        System.out.println("car stopping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
