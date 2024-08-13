package classandobject;

import jdk.jfr.Enabled;

public class Bike extends Vehicle implements VehicleInterface {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void whoAmI(){
        System.out.println("I am a bike");
    }
}
