package Creational.BuilderDesignPattern.BuilderExample1;

public class Director {

    public void buildHonda(CarBuilder builder){

        builder.setId(1)
                .setBrand("Hyndai")
                .setModel("Honda")
                .setEngine("X")
                .setFuel("Petrol")
                .setColor("Red")
                .setNoOfDoors(4)
                .setAirbags(true)
                .build();
    }

    public void buildLambo(CarBuilder builder){

        builder.setId(2)
                .setBrand("Lambo")
                .setModel("A")
                .setEngine("Super")
                .setFuel("diesel")
                .setColor("Green")
                .setNoOfDoors(2)
                .build();
    }


}
