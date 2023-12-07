package Creational.BuilderDesignPattern.ProblemWithIntial;

public class BuilderClient {

    public static void main(String[] args) {

        Car car1=new Car(1,"Honda","ModelX","EngineX","FuelX","Red",4,true
        ,"CentralLockX","Sony",false);


        Car car2=new Car(2,"Lambo","A","EngineY","Petrol","Red",2,false
        ,null,null,false);
    }
}
