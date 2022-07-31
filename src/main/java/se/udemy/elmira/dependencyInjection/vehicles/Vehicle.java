package se.udemy.elmira.dependencyInjection.vehicles;

import se.udemy.elmira.dependencyInjection.parts.Engine;

public class Vehicle {

    private Engine myEngine;

    public Vehicle(Engine anEngine) {
        this.myEngine = anEngine;
    }

    public void crankIgnition(){
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
