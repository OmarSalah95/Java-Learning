package src;

public class Car {
    // Declare internal state/attributes
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    // Set a default if no info provided on class creation
    // calls the method that matches parameters given
    // public Car() {
    //     this("Camry", 2, 4);
    //     System.out.println("Empty constructor called");
    // }
    // Constructor

    // Every time a new class of this is created, do this:
    // way to initialize the class at time of creation,
    // instead of using 20 setters every time
    public Car(String model, int doors, int wheels, String engine, String color) {
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.doors = doors;
        this.wheels = wheels;
        System.out.println("New car has been made: " + model + doors + wheels + engine + color);
    }

    public Car(String model) {
        this(model, 2, 4, "4 cylinder", "red");
        System.out.println("Default settings applied");
    }

}

