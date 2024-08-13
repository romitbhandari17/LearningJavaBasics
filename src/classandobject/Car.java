package classandobject;

import accessModifiers.Laptop;

import java.io.Serial;
import java.io.Serializable;

public class Car extends Vehicle implements VehicleInterface{

    public Car() {
    }

    private String name;
    private String brand;
    private float mileage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public void whoAmI(){
        System.out.println("I am a car");
    }
}
