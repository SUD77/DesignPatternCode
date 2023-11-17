package ObserverDesignPattern.PracticeWithShivangi;

import java.util.ArrayList;
import java.util.List;

public class LakmeGroup {


    private List<Subscriber> subList=new ArrayList<>();

    public void subcribe(Subscriber user){
        subList.add(user);
    }

    public void unSubscribe(Subscriber user){
        subList.remove(user);
    }

    public void notifyTheSubscribers(String msg){
        for(Subscriber user:subList){
            user.notification(msg);
        }
    }

}
