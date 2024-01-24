package se.distansakademin.generics_demo;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String brand) {
        this(brand, 4);
    }

    public Car(String brand, int numberOfDoors) {
        super(brand);

        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 5);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
