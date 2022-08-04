package se.udemy.elmira.factoryDesignPattern;

public class App {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = new VehicleFactory().getVehicle(VehicleType.CAR);
        vehicle.startEngine();
    }
}
