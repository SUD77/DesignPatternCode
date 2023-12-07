package Creational.BuilderDesignPattern.BuilderExample2;

public class Director {

    public void buildLambo(CarBuilder builder){
        builder.id(1)
                .brand("Lambo")
                .model("X")
                .engine("Superfast")
                .color("Red")
                .noOfwheels(4)
                .noOfDoors(2)
                .airbags(true)
                .build();
    }

    public void buildSuzuki(BikeBuilder builder){
        builder.id(2)
                .brand("Suzuki")
                .model("Y")
                .color("Blue")
                .fuel("Desiel")
                .engine("Fastest")
                .noOfwheels(2)
                .build();
    }
}
