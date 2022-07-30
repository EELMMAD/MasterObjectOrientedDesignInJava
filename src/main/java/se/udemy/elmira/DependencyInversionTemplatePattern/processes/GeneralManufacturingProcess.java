package se.udemy.elmira.DependencyInversionTemplatePattern.processes;

public abstract class GeneralManufacturingProcess {
    private String precessName;
    public GeneralManufacturingProcess(String name) {
        precessName = name;
    }

    //steps of general manufacturing Process
    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();



    //The methods must run in order
    //Template Method Design Pattern
    public void launchProcess(){
    if(precessName != null && !precessName.isEmpty()){
        assembleDevice();
        testDevice();
        packageDevice();
        storeDevice();
    }
    else {
        System.out.println("no process name was specified");
    }
    }
}
