package ObserverDesignPattern.PracticeWithShivangi;

public class User implements Subscriber{

    private int userId;

    User(int id){
        this.userId=id;
    }

    @Override
    public void notification(String msg) {
        System.out.println("User " + userId  + " received the msg " + msg);
    }
}
