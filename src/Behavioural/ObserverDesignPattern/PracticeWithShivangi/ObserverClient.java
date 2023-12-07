package Behavioural.ObserverDesignPattern.PracticeWithShivangi;

public class ObserverClient {

    public static void main(String[] args) {

        User user1=new User(1);
        User user2=new User(2);
        User user3=new User(3);

        NykaaGroup nykaaGroup=new NykaaGroup();
        LakmeGroup lakmeGroup=new LakmeGroup();

        nykaaGroup.subcribe(user1);
        nykaaGroup.subcribe(user2);
        nykaaGroup.subcribe(user3);

        nykaaGroup.notifyTheSubscribers("Nyakaa lipstick is available");

        lakmeGroup.subcribe(user1);

        lakmeGroup.notifyTheSubscribers("lakme makeup is available");

        




    }
}
