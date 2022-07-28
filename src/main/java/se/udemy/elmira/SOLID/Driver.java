package se.udemy.elmira.SOLID;

public class Driver {
    public void drive(Vehicle raceCar){ //Driver depends on vehicle
        raceCar.accelerate();
    }
}
