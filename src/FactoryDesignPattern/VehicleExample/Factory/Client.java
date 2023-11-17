package FactoryDesignPattern.VehicleExample.Factory;

public class Client {

    public static void main(String[] args) {

        String vehicleType="Bike";

        Vehicle vehicle=VehicleFactory.getVehicle(vehicleType);
        vehicle.producingThisVehicle();
    }

}


/* 1. In vehicle factory, we have made the function static. That's why we didnt create
object of VehicleFactory.
*
*
*
* */
