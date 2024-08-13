package classandobject;

public class CallingClass {

    public static void main(String[] args) {
        IdentifyVehicle identifyObj = new IdentifyVehicle();

        VehicleInterface vehicle = new Bike();

        identifyObj.setVehicle(vehicle);
        identifyObj.whoAmI();
    }

}
