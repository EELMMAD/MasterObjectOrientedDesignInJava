package se.udemy.elmira.dependencyInjection;

public class Vehicle {

    Engine myEngine;

    public Vehicle(Engine anEngine) {
        this.myEngine = anEngine;
    }

    public void crankIgnition(){
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
