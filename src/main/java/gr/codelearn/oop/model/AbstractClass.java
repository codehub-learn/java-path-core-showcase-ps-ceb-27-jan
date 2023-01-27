package gr.codelearn.oop.model;

public abstract class AbstractClass {
    private String name;

    abstract void move();

    void stop(){
        System.out.println("stopping");
    }
}
