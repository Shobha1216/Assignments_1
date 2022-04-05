package com.db;
import java.sql.*;

public class Dbconn {
    public Connection setConnection(){

       /* Connection connection = null;
        Statement statement = null;*/
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/abc","postgres", "root");
            /*int movieId= input.nextInt();
            statement = connection.createStatement();
            String searchEle = "select * from Movie where movieId = '" +movieId + "'";
            ResultSet resultSet = statement.executeQuery(searchEle);*/
           /* while (resultSet.next()) {
                int movieid = resultSet.getInt(1);
                String moviename = resultSet.getString(2);
                String release_date = resultSet.getString(3);
                System.out.println(movieid + " " + moviename + " " + release_date );
            }*/
        }catch (Exception e) {
            e.printStackTrace();
            return null;

        }

        }

    public ResultSet getMovieList() throws SQLException {
        Connection connection = setConnection();
        ResultSet resultSet=connection.createStatement().executeQuery("select * from Movie");
        return resultSet;
    }
    }

