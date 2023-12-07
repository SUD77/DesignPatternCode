package Creational.SingletonDesignPattern.BasicExample.WithoutSP;

public class Logger {

    Logger(){
        System.out.println("New instance created");
    };

    void log(String msg){
        System.out.println(msg);
    };
}
