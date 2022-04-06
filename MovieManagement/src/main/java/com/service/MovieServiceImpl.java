package com.service;

import com.db.DbConnection;
import com.model.Movie;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService {
    DbConnection dbConnection = new DbConnection();
    List<Movie> movieList=new ArrayList<Movie>();

    @Override
    public List<Movie> getMovies() {
        try {
            ResultSet resultSet=dbConnection.getMovieList();
            while (resultSet.next()) {
                Movie movie=new Movie();
                movie.setMovieId(resultSet.getInt(1));
                movie.setMovieName(resultSet.getString(2));
                movie.setReleaseDate(resultSet.getString(3));
                movieList.add(movie);
            }
            return movieList;

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Movie getMovieId(int movieId) {

       return null;
    }


    @Override
    public Movie createMovie(Movie movie) throws SQLException {
        dbConnection.insertMovie(movie);
        movieList.add(movie);
        return movie;
    }

    @Override
    public Movie updateMovie(Movie movie) throws SQLException {
        dbConnection.updateMovie(movie);
        return movie;

    }

    @Override
    public Movie DeleteMovie(Movie movie) throws SQLException {
        dbConnection.deleteMovie(movie);
        return movie;
    }




}
