package ObserverDesignPattern.NotificationExample;

public class ObserverClient {

    public static void main(String[] args) {

        //Creating users
        User user1=new User(1);
        User user2=new User(2);
        User user3=new User(3);


        SamsungGroup samsungGroup=new SamsungGroup();

        samsungGroup.subscribed(user1);
        samsungGroup.subscribed(user2);
        samsungGroup.subscribed(user3);

        samsungGroup.notify("Samsung phone 1 is available");

        samsungGroup.unSubscribe(user1);

        samsungGroup.notify("Samsung phone 2 is available");


        //AppleGroup
        AppleGroup appleGroup=new AppleGroup();

        appleGroup.subscribed(user1);

        appleGroup.notify("Apple phone is available");

    }

}
