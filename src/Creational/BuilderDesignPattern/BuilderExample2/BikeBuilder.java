package Creational.BuilderDesignPattern.BuilderExample2;

public class BikeBuilder implements Builder{

    private int id;
    private String brand;
    private String model;
    private String engine;
    private String fuel;
    private String color;
    private int noOfWheels;


    @Override
    public BikeBuilder id(int id) {
        this.id=id;
        return this;
    }

    @Override
    public BikeBuilder brand(String brand) {
        this.brand=brand;
        return this;
    }

    @Override
    public BikeBuilder model(String model) {
        this.model=model;
        return this;
    }

    @Override
    public BikeBuilder color(String color) {
        this.color=color;
        return this;
    }

    @Override
    public BikeBuilder engine(String engine) {
        this.engine=engine;
        return this;
    }

    @Override
    public BikeBuilder noOfwheels(int noOfWheels) {
        this.noOfWheels=noOfWheels;
        return this;
    }

    public BikeBuilder fuel(String fuel){
        this.fuel=fuel;
        return this;
    }

    public Bike build(){
        return new Bike(id,brand,model,engine,fuel,color,noOfWheels);
    }
}
