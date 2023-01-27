package gr.codelearn.model;

public class Bike implements Vehicle, Interface2 {
    @Override
    public void move() {
        System.out.println("bike moving");
    }

    @Override
    public void stop() {
        System.out.println("bike stopping");
    }

    public void wheelie(){
        System.out.println("performing a wheelie");
    }
}
