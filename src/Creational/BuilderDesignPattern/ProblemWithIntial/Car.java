package Creational.BuilderDesignPattern.ProblemWithIntial;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String engine;
    private String fuel;
    private String color;
    private int noOfDoors;

    //Optional
    private boolean airbags;
    private String centralLock;
    private String musicSystem;
    private boolean sunRoof;

    public Car(int id, String brand, String model, String engine, String fuel,
               String color, int noOfDoors, boolean airbags, String centralLock,
               String musicSystem, boolean sunRoof) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
        this.noOfDoors = noOfDoors;
        this.airbags = airbags;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    public Car(int id, String brand, String model, String engine, String fuel, String color,
               int noOfDoors, boolean airbags, String musicSystem) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
        this.noOfDoors = noOfDoors;
        this.airbags = airbags;
        this.musicSystem = musicSystem;
    }

    public Car(int id, String brand, String model, String engine, String fuel, String color, int noOfDoors) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
        this.noOfDoors = noOfDoors;
    }


}
