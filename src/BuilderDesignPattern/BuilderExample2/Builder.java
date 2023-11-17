package BuilderDesignPattern.BuilderExample2;

public interface Builder {

    Builder id(int id);
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Builder engine(String engine);
    Builder noOfwheels(int noOfWheels);
}
