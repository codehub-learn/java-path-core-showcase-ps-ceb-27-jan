package gr.codelearn.model;

public abstract class AbstractClass {
    private String name;

    abstract void move();

    void stop(){
        System.out.println("stopping");
    }
}
