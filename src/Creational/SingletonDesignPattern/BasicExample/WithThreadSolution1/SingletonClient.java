package Creational.SingletonDesignPattern.BasicExample.WithThreadSolution1;


/*
* Add synchroized in the static getInstance() function.
*
* Demerits :
*
* 1. Synchronized is expensive.
* 2. it’s actually a little worse than you make
out: the only time synchronization is relevant is the first time
through this method. In other words, once we’ve set the
uniqueInstance variable to an instance of Singleton, we have
no further need to synchronize this method. After the first time
through, synchronization is totally unneeded overhead!

* */

public class SingletonClient {

    public static void main(String[] args) {


        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log1= Logger.getLoggerInstance();
                log1.log("Msg from user 1");
                System.out.println("InstanceNo of log1 is: " + log1.toString());
                System.out.println("InstanceNo of log1 is: " + log1.hashCode());
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log2= Logger.getLoggerInstance();
                log2.log("Msg from user 2");
                System.out.println("InstanceNo of log1 is: " + log2.toString());
                System.out.println("InstanceNo of log1 is: " + log2.hashCode());
            }
        });

        t1.start();
        t2.start();
    }


}



