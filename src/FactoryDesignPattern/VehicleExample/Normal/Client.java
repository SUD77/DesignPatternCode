package FactoryDesignPattern.VehicleExample.Normal;

public class Client {

    public static void main(String[] args) {


        String vehicleType="Car";

        Vehicle vehicle;
        if(vehicleType.equals("Car")){
            vehicle=new Car();
        } else {
            vehicle = new Bike();
        }

        vehicle.producingThisVehicle();
    }


    /*Problem with this :
    * 1. If tmmrow, our factory decideds to increase the type of vehicle, then we will have to
    * tell the client to import those vehicle files and write condition for those in if else.
    * This is not a good practice.
    * We are telling client to change and compile his code every time
    * Here, it is very tightly coupled.
    *
    * 2. Creational logic should not be exposed to client.
    *
    *
    *
    * */
}
