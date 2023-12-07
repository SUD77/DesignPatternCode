package Creational.SingletonDesignPattern.BasicExample.WithThreadSolution3;


public class Logger {

    private Logger(){
        System.out.println("New instance created");
    };


    /*
    *   The volatile keyword ensures that multiple threads
        handle the uniqueInstance variable correctly when it
        is being initialized to the Singleton instance.
    *
    */
    static volatile Logger uniqueInstance;

    static Logger getLoggerInstance(){


        /*
        *
        *
        * */
        if(uniqueInstance==null){    //Check for an instance and if there isn’t one, enter a synchronized block


            synchronized (Logger.class){  //Note we only synchronize   the first time through

                if(uniqueInstance==null){
                    uniqueInstance=new Logger();    //Once in the block, check again and if it’s still null, create an instance

                }
            }
        }
        return uniqueInstance;
    }

    void log(String msg){
        System.out.println(msg);
    };
}
