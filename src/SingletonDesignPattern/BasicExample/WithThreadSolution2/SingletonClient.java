package SingletonDesignPattern.BasicExample.WithThreadSolution2;

// Solution 2 : Early Initiazilation. (Check in logger class)

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



