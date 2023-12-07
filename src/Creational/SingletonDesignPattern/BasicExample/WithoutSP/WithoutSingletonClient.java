package Creational.SingletonDesignPattern.BasicExample.WithoutSP;

public class WithoutSingletonClient {

    public static void main(String[] args) {


        Logger log1=new Logger();
        log1.log("Msg from user 1");
        System.out.println("InstanceNo of log1 is: " + log1.toString());

        System.out.println();

        Logger log2=new Logger();
        log1.log("Msg from user 2");
        System.out.println("InstanceNo of log2 is: " + log2.toString());
    }
}


