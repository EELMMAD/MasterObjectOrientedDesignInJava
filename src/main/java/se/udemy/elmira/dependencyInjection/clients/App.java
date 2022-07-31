package se.udemy.elmira.dependencyInjection.clients;

import se.udemy.elmira.dependencyInjection.parts.LargeEngine;
import se.udemy.elmira.dependencyInjection.vehicles.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle(new LargeEngine(500));
        raceCar.crankIgnition();
    }
}
