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

        if (fuelLevel <= 0 || damaged) {
                // "|" -booth expressions are evaluated even that the first expression is true
                // "||" -stopped if first expression is true
            System.out.println("You cannot accelerate!");
            return 0;                       // exit accelerate() method
        }

        if (speed > maxSpeed) {
            System.out.println("Max speed exceeded!");
            return 0;                       // exit accelerate() method
        } else if (speed == maxSpeed) {
            System.out.println("Careful, max speed reached.");
        } else {
            System.out.println("Valid speed entered.");
        }

        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + "h");

        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance; // totalTraveledDistance += distance;
        System.out.println("Total traveled distance for vehicle " + name + ": " + totalTraveledDistance);

        double mileageMultiplier = 1;

        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }

        double usedFuel = distance * mileage * mileageMultiplier / 100;
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + ": " + fuelLevel);

        return distance;
    }
}
