package se.lexicon;

public class Car {

    /**
     * Make a program that can print out “drive” method in a OOP way.
     * a. Create a class “Car” with the following fields:
     * id, year, model, colour, motorSize.
     * b. Create a public method “drive” inside “Car” which will print:
     * model + ” with motor ” + motorSize + ” can drive now.”
     * c. In the main program make instance of “Car” and call the method “drive”.
     */

    private int id;
    private String colour;
    private String motorSize;
    private int model;
    private Person owner;

    private static int sequencer = 0;

    public Car(String colour, String motorSize, int model) {
        this.id = ++sequencer;
        this.colour = colour;
        this.motorSize = motorSize;
        this.model = model;
    }

    public String drive() {
        return "car  model: " + model + " " + "with motor: " + motorSize + " can drive now" + " car owner "+ owner.getName();
    }


    public int getId() {
        return id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(String motorSize) {
        this.motorSize = motorSize;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


}
