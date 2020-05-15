package src;

public class Car {
    // Declare internal state/attributes
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

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

