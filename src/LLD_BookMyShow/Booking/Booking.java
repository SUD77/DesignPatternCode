package LLD_BookMyShow.Booking;

import LLD_BookMyShow.Enums.BookingStatus;
import LLD_BookMyShow.Movie.Show;
import LLD_BookMyShow.Movie.ShowSeat;
import LLD_BookMyShow.Payment.Payment;

import java.util.Date;
import java.util.List;

public class Booking {

    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus bookingStatus;
    private Show show;
    private List<ShowSeat> seat;
    private Payment payment;

    boolean makePayment(Payment payment){

    }

    boolean cancel(Payment payment){

    }

    boolean assignSeats(List<ShowSeat> seat){

    }
}
