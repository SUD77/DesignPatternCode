package LLD_BookMyShow.Users;

import LLD_BookMyShow.Movie.Movie;
import LLD_BookMyShow.Movie.Show;

public class Admin extends Person{
    public boolean addMovie(Movie movie){
        return false;
    }

    public boolean addShow(Show show){
        return true;
    }

    public boolean blockUser(Customer customer){
        return false;
    }

}
