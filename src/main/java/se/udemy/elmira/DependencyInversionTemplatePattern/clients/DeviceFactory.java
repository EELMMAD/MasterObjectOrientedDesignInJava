package se.udemy.elmira.DependencyInversionTemplatePattern.clients;

import se.udemy.elmira.DependencyInversionTemplatePattern.processes.GeneralManufacturingProcess;
import se.udemy.elmira.DependencyInversionTemplatePattern.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone process");
        manufacturer.launchProcess();
    }
}
