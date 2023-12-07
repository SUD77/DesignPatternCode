package Creational.BuilderDesignPattern.BuilderExample2;

public class CarBuilder implements Builder{

    private int id;
    private String brand;
    private String model;
    private String engine;
    private String fuel;
    private String color;
    private int noOfWheels;




    private int noOfDoors;

    //Optional
    private boolean airbags;
    private String centralLock;
    private String musicSystem;
    private boolean sunRoof;



    @Override
    public CarBuilder id(int id) {
        this.id=id;
        return this;
    }

    @Override
    public CarBuilder brand(String brand) {
        this.brand=brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model=model;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color=color;
        return this;
    }

    @Override
    public CarBuilder engine(String engine) {
        this.engine=engine;
        return this;
    }

    @Override
    public CarBuilder noOfwheels(int noOfWheels) {
        this.noOfWheels=noOfWheels;
        return this;
    }

    public CarBuilder noOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
        return this;
    }

    public CarBuilder airbags(boolean airbags) {
        this.airbags = airbags;
        return this;
    }

    public CarBuilder centralLock(String centralLock) {
        this.centralLock = centralLock;
        return this;
    }


    public CarBuilder musicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
        return this;
    }


    public CarBuilder sunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
        return this;
    }

    public Car build(){
        return new Car(id,brand,model,engine,fuel,color,noOfWheels,noOfDoors,airbags,centralLock,musicSystem,sunRoof);
    }
}
