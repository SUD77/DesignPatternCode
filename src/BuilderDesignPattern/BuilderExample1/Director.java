package BuilderDesignPattern.BuilderExample1;

public class Director {

    public void buildHonda(CarBuilder builder){

        builder.id(1)
                .brand("Hyndai")
                .model("Honda")
                .engine("X")
                .fuel("Petrol")
                .color("Red")
                .noOfDoors(4)
                .airbags(true)
                .build();
    }

    public void buildLambo(CarBuilder builder){

        builder.id(2)
                .brand("Lambo")
                .model("A")
                .engine("Super")
                .fuel("diesel")
                .color("Green")
                .noOfDoors(2)
                .build();
    }
}
