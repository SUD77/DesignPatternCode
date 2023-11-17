package FactoryDesignPattern.VehicleExample.Factory;


public class VehicleFactory {

    static Vehicle getVehicle(String vehicleType){

        Vehicle vehicle;

        if(vehicleType.equals("Car")){
            vehicle=new Car();
        } else {
            vehicle = new Bike();
        }

        return  vehicle;
    }
}
