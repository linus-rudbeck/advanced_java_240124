package se.distansakademin.generics_demo;

public class RaceTrack<T extends Vehicle> {
    private final T vehicle;

    public RaceTrack(String vehicleBrand) {
        vehicle = (T) new Vehicle(vehicleBrand);
    }

    public void raceAround(){
        for (int i = 0; i < 15; i++) {
            vehicle.accelerate();
        }

        System.out.println(vehicle.getBrand() + " has speed " + vehicle.getSpeed());

        while(vehicle.getSpeed() > 0){
            vehicle.brake();
        }

        System.out.println(vehicle.getBrand() + " has speed " + vehicle.getSpeed());
    }
}
