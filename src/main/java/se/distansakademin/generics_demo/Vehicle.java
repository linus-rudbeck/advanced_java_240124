package se.distansakademin.generics_demo;

public class Vehicle {

    private int speed;

    private String brand;

    public Vehicle(String brand) {
        speed = 0;
        this.brand = brand;
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake(){
        speed -= 5;

        if (speed < 0) {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
