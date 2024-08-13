package classandobject;

import jdk.jfr.Enabled;

public class IdentifyVehicle {

    private VehicleInterface vehicle;

    public VehicleInterface getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleInterface vehicle) {
        this.vehicle = vehicle;
    }

    public void whoAmI(){
        vehicle.whoAmI();
    }
}
