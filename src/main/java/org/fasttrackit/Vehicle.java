package org.fasttrackit;

public class Vehicle {

        // instance variables
    String name;
    String color;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;
    boolean damaged;

    public double accelerate(double speed, double durationInHours) {
            // Ferrari is accelerating with 100 km/h for 1h
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + "h");

        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance; // totalTraveledDistance += distance;
        System.out.println("Total traveled distance for vehicle " + name + ": " + totalTraveledDistance);

        double usedFuel = distance * mileage / 100;
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + ": " + fuelLevel);

        return distance;
    }
}
