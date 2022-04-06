package com.service;

import com.model.Movie;

import java.sql.SQLException;
import java.util.List;


public interface MovieService {

    List<Movie> getMovies();
    Movie getMovieId(int movieId);
    Movie createMovie(Movie movie) throws SQLException;
    Movie updateMovie(Movie movie) throws SQLException;
    Movie DeleteMovie(Movie movie) throws SQLException;

}
