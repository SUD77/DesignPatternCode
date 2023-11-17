package LLD_BookMyShow.Search;

import LLD_BookMyShow.Movie.Movie;

import java.util.List;

public interface Search {

    List<Movie> searchByTitle(String title);
    List<Movie> searchByLanguage(String language);
    List<Movie> searchByGenre(String genre);
    List<Movie> searchByReleaseDate(String releaseDate);
    List<Movie> searchByCity(String cityName);

}
