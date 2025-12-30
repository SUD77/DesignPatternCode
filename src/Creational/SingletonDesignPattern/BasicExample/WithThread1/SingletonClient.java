package Creational.SingletonDesignPattern.BasicExample.WithThread1;


public class SingletonClient {

    public static void main(String[] args) {


        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log1=Logger.getLoggerInstance();
                log1.log("Msg from user 1");
                System.out.println("InstanceNo of log1 is: " + log1.toString());
                System.out.println("InstanceNo of log1 is: " + log1.hashCode());
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log2=Logger.getLoggerInstance();
                log2.log("Msg from user 2");
                System.out.println("InstanceNo of log2 is: " + log2.toString());
                System.out.println("InstanceNo of log2 is: " + log2.hashCode());
            }
        });

        t1.start();
        t2.start();
    }


}



