package gr.codelearn.oop.model;

import gr.codelearn.oop.model.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        Car car2 = new Car();

        ElectricCar electricCar = new ElectricCar("e22", "bmw1", "type 1");
        electricCar.move();

        Car electricCar2 = new ElectricCar("e23", "bmw2", "type 2");

        Object electricCar3 = new ElectricCar("e24", "bmw2", "type 3");

        ElectricCar electricCar4 = new ElectricCar(Color.WHITE);

        System.out.println(Color.BLACK.getHexCode());

        Bike bike = new Bike();
        Vehicle bike2 = new Bike();
        bike2.move();
        bike2.stop();

        Vehicle vehicle = new Bike();
        vehicle.move();
        vehicle.stop();
    }
}
