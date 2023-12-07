package Creational.SingletonDesignPattern.BasicExample.WithSP;


public class SingletonClient {

    public static void main(String[] args) {

        Logger log1=Logger.getLoggerInstance();
        log1.log("Msg from user 1");
        System.out.println("InstanceNo of log1 is: " + log1.toString());
        System.out.println("InstanceNo of log1 is: " + log1.hashCode());


        System.out.println();

        Logger log2=Logger.getLoggerInstance();
        log2.log("Msg from user 2");
        System.out.println("InstanceNo of log2 is: " + log2.toString());
        System.out.println("InstanceNo of log2 is: " + log2.hashCode());
    }


}



