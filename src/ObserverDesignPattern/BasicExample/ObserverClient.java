package ObserverDesignPattern.BasicExample;

public class ObserverClient {

    public static void main(String[] args) {


        Group group=new Group();

        User user1=new User(1);
        User user2=new User(2);
        User user3=new User(3);

        group.subscribed(user1);
        group.subscribed(user2);
        group.subscribed(user3);

        group.notify("Samsung phone is available");

        group.unSubscribe(user1);

        group.notify("Apple phone is available");
    }

}
