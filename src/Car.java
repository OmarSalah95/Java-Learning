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
    public Car() {
        this("Camry", 2, 4);
        System.out.println("Empty constructor called");
    }
    // Constructor

    // Every time a new class of this is created, do this:
    // way to initialize the class at time of creation,
    // instead of using 20 setters every time
    public Car(String model, int doors, int wheels) {
        this.model = model;
        this.doors = doors;
        this.wheels = wheels;
        System.out.println("New car has been made");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car(String engine, String color) {
        this.setEngine(engine);
        this.setColor(color);
        System.out.println("only 2 ");
    }

    

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // setter - settting state/attributes of class
    public void setModel(String model) {
        // change input to lowercase, check if its what's expected below
        String validateModel = model.toLowerCase();
        //  Encapsulation - internal safety check to make sure only preapproved
        //  state/attributes can be added to a class
        if (validateModel.equals("carrera") || validateModel.equals("911")) {
            this.model = model;
        }
        else {
            this.model = "unknown";
        }
    }
    // getter - retrieving state/attributes of class
    public String getModel () {
        return this.model;
    }
}

