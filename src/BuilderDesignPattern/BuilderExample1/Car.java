package BuilderDesignPattern.BuilderExample1;


/*
* Note : the Constructor here should be private as, it should be used only by the builder class and
* shouldnt be accessible to anyone other.
* So, that no other class uses this constructor to create object of Car.
* Object of Car which be only be created using CarBuilder.
*
* that is, if builder is outside the Car class, then this car constructor should be package private
* and if builder is Inner class, i.e defined here in this class itself, then, car constructor should be
* private.
*
* This is done only to make sure that this Car constructor is only accessible to CarBuilder.
*
* */
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


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", color='" + color + '\'' +
                ", noOfDoors=" + noOfDoors +
                ", airbags=" + airbags +
                ", centralLock='" + centralLock + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", sunRoof=" + sunRoof +
                '}';
    }
}
