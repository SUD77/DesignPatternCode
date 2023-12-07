package Creational.BuilderDesignPattern.BuilderExample2;

public class Bike {

    private int id;
    private String brand;
    private String model;
    private String engine;
    private String fuel;
    private String color;
    private int noOfWheels;

    public Bike(int id, String brand, String model, String engine, String fuel, String color, int noOfWheels) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}
