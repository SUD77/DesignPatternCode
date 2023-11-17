package ObserverDesignPattern.NotificationExample;

import java.util.ArrayList;
import java.util.List;

public class AppleGroup {


    private List<Subscriber> subscriberList=new ArrayList<>();

    void subscribed(Subscriber user){
        subscriberList.add(user);
    }

    void unSubscribe(Subscriber user){
        subscriberList.remove(user);
    }

    void notify(String msg){
        System.out.println();
        for(Subscriber users:subscriberList){
            users.notify(msg);
        }
    }

}
