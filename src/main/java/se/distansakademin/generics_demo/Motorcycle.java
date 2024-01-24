package se.distansakademin.generics_demo;

public class Motorcycle extends Vehicle {

    private boolean hasSideCar;

    public Motorcycle(String brand) {
        this(brand, false);
    }


    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 15);
    }

    public Motorcycle(String brand, boolean hasSideCar) {
        super(brand);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
