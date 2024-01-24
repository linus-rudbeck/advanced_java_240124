package se.distansakademin;

import se.distansakademin.generics_demo.Car;
import se.distansakademin.generics_demo.Motorcycle;
import se.distansakademin.generics_demo.RaceTrack;

public class Main {
    public static void main(String[] args) {

        var carRaceTrack = new RaceTrack<Car>("Generic car");
        carRaceTrack.raceAround();

        var motorcycleRaceTrack = new RaceTrack<Motorcycle>("Generic MC");
        motorcycleRaceTrack.raceAround();
    }
}