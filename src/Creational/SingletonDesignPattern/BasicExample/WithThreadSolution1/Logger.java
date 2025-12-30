package Creational.SingletonDesignPattern.BasicExample.WithThreadSolution1;



/*
 * For singleton pattern
 * 1. Make constructor private
 * 2. Create a static instance of class.
 * 3. Creata a public static fucntion to return the instance of the class.
 * */

public class Logger {

    /*
     * 1. As we have made constructor private, we cant make objects like
     * the way we used to
     *
     * 2. We can do it by using a public function, which will do the work for us.
     * */
    private Logger(){
        System.out.println("New instance created");
    };


    //static variable to hold
    static Logger uniqueInstance;


    /*Why will this function needs to be static
     * 1. Because to call a function of a class, we need objects, but now
     * we cant create objects. So to call a function it needs to be static. So that
     * we can directly call it with clas name.
     *
     * */
    static synchronized Logger getLoggerInstance(){

        if(uniqueInstance==null){
            uniqueInstance=new Logger();
        }
        return uniqueInstance;
    }

    void log(String msg){
        System.out.println(msg);
    };
}
