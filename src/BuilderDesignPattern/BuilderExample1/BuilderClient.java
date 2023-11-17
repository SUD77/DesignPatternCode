package BuilderDesignPattern.BuilderExample1;

public class BuilderClient {

    public static void main(String[] args) {

        Director director=new Director();
        CarBuilder builder=new CarBuilder();

        director.buildHonda(builder);
        System.out.println(builder.build());

        director.buildLambo(builder);
        System.out.println(builder.build());

//        builder.id(3)
//                .brand("Shvaangi")
//                .color("Yellow")
//                .engine("Maaat")
//                .noOfDoors(4)
//                .centralLock("Yes")
//                .build();
//
//        System.out.println(builder.build().toString());

    }
}
