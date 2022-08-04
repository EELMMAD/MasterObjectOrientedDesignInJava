package se.udemy.elmira.factoryDesignPattern;

public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType){
        return vehicleType.getVehicle();
    }
}
