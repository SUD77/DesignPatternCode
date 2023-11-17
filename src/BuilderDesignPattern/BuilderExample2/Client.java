package BuilderDesignPattern.BuilderExample2;

public class Client {

    public static void main(String[] args) {

        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        BikeBuilder bikeBuilder=new BikeBuilder();

        director.buildLambo(carBuilder);
        System.out.println(carBuilder.build());

        director.buildSuzuki(bikeBuilder);
        System.out.println(bikeBuilder.build());

    }
}
