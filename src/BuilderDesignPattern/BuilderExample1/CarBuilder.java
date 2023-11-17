package BuilderDesignPattern.BuilderExample1;


/*
* 1. Inside this buidler we will have same fields as Car class but each field will have reserved setter method
* without a setter prefix
* 2. We will also have build method, which returns the instance of the object this builder is going to create
* 3. This build method will make use of the origianl constructor defined in Car class.
* 4. But here, we wont have to set those values as null which are not required. (In case of original
* use of constructor i.e of Car constructor, we had to put not required values as null)
*
* */
public class CarBuilder {

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

    public CarBuilder id(int id){
        this.id=id;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder fuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
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
        return new Car(id,brand,model,engine,fuel,color,noOfDoors,airbags,centralLock,musicSystem,sunRoof);
    }
}

