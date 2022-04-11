<<<<<<< HEAD
package com.db;
import com.model.Movie;

import java.sql.*;

public class DbConnection {
    public Connection setConnection(){
        Connection connection=null;
        Statement statement=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/moviedb","postgres", "root");
            statement=connection.createStatement();
        }catch (Exception e) {
            e.printStackTrace();
            return null;

        }
        return connection;
        }

    public ResultSet getMovieList() throws SQLException {
        Connection connection = setConnection();
        ResultSet resultSet=connection.createStatement().executeQuery("select * from Movie order by movieName ASC");
       // ResultSet resultSet=connection.createStatement().executeQuery("select * from Movie ");
        return resultSet;

    }
    public void insertMovie(Movie movie) throws SQLException {

        Connection connection=setConnection();
        PreparedStatement preparedStatement =connection.prepareStatement("insert into Movie values(?,?,?)");
        preparedStatement.setInt(1,movie.getMovieId());
        preparedStatement.setString(2,movie.getMovieName());
        preparedStatement.setString(3,movie.getReleaseDate());
        preparedStatement.executeUpdate();

    }
    public void updateMovie(Movie movie) throws SQLException {
        Connection connection=setConnection();
        PreparedStatement updateStatement = connection.prepareStatement("update Movie set moviename =? , release_date=? where movieid=?");
        updateStatement.setString(1, movie.getMovieName());
        updateStatement.setString(2,movie.getReleaseDate());
        updateStatement.setInt(3,movie.getMovieId());
        updateStatement.executeUpdate();

    }
    public void deleteMovie(Movie movie) throws SQLException {
        Connection connection=setConnection();
        PreparedStatement deleteStatement = connection.prepareStatement("delete from Movie where movieid=?");
        deleteStatement.setInt(1,movie.getMovieId());
        deleteStatement.executeUpdate();
    }

}
=======
package com.db;
import com.model.Movie;

import java.sql.*;

public class DbConnection {
    public Connection setConnection(){
        Connection connection=null;
        Statement statement=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/moviedb","postgres", "root");
            statement=connection.createStatement();
        }catch (Exception e) {
            e.printStackTrace();
            return null;

        }
        return connection;
        }

    public ResultSet getMovieList() throws SQLException {
        Connection connection = setConnection();
        ResultSet resultSet=connection.createStatement().executeQuery("select * from Movie order by movieName ASC");
       // ResultSet resultSet=connection.createStatement().executeQuery("select * from Movie ");
        return resultSet;

    }
    public void insertMovie(Movie movie) throws SQLException {

        Connection connection=setConnection();
        PreparedStatement preparedStatement =connection.prepareStatement("insert into Movie values(?,?,?)");
        preparedStatement.setInt(1,movie.getMovieId());
        preparedStatement.setString(2,movie.getMovieName());
        preparedStatement.setString(3,movie.getReleaseDate());
        preparedStatement.executeUpdate();

    }
    public void updateMovie(Movie movie) throws SQLException {
        Connection connection=setConnection();
        PreparedStatement updateStatement = connection.prepareStatement("update Movie set moviename =? , release_date=? where movieid=?");
        updateStatement.setString(1, movie.getMovieName());
        updateStatement.setString(2,movie.getReleaseDate());
        updateStatement.setInt(3,movie.getMovieId());
        updateStatement.executeUpdate();

    }
    public void deleteMovie(Movie movie) throws SQLException {
        Connection connection=setConnection();
        PreparedStatement deleteStatement = connection.prepareStatement("delete from Movie where movieid=?");
        deleteStatement.setInt(1,movie.getMovieId());
        deleteStatement.executeUpdate();
    }

}
>>>>>>> 99590ce5a409d91f3c9ed95608f6878dac66884f
