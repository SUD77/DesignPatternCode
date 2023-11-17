package LLD_BookMyShow.Search;

import LLD_BookMyShow.Movie.Movie;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{

    HashMap<String , List<Movie>> movieTitle;
    HashMap<String , List<Movie>> movieLanguage;
    HashMap<String , List<Movie>> movieGenres;
    HashMap<String , List<Movie>> movieReleaseDate;
    HashMap<String , List<Movie>> movieCities;

    @Override
    public List<Movie> searchByTitle(String title){
        return movieTitle.get(title);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return movieLanguage.get(language);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return movieGenres.get(genre);
    }

    @Override
    public List<Movie> searchByReleaseDate(String releaseDate) {
        return movieReleaseDate.get(releaseDate);
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        return movieCities.get(cityName);
    }


}
