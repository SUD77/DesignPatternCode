package BuilderDesignPattern.BuilderExample2;

public class Car {

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

    public Car(int id, String brand, String model, String engine, String fuel,
               String color, int noOfWheels, int noOfDoors, boolean airbags,
               String centralLock, String musicSystem, boolean sunRoof) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.airbags = airbags;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", airbags=" + airbags +
                ", centralLock='" + centralLock + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", sunRoof=" + sunRoof +
                '}';
    }
}
