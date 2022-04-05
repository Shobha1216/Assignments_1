package com.service;

import com.db.Dbconn;
import com.model.Movie;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class MovieServiceImpl implements MovieService {
    Scanner input=new Scanner(System.in);
    public static Dbconn dbConnection = new Dbconn();
    @Override
    public List<Movie> getMovies() {
        return null;
    }

    @Override
    public Movie getMovieId(int movieId) {
        Connection connection = null;
        Statement statement = null;
        int ele=input.nextInt();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Movie");

            while (resultSet.next()) {
                int movieid = resultSet.getInt(1);
                String moviename = resultSet.getString(2);
                String release_date = resultSet.getString(3);
                System.out.println(movieid + " " + moviename + " " + release_date);
            }

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return null;
    }

    @Override
    public Movie createMovie()  {
        return null;
    }

    @Override
    public Movie updateMovie() {
        return null;
    }
}
