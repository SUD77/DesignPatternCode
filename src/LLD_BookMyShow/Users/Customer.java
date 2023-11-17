package LLD_BookMyShow.Users;

import LLD_BookMyShow.Booking.Booking;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    public boolean makeBooking(Booking booking){
        return false;
    }

    public List<Booking> getBooking(){
        return new ArrayList<>();
    }
}
