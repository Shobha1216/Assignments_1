<<<<<<< HEAD
package com.servlets;

import com.db.DbConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Movie;
import com.service.MovieService;
import com.service.MovieServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class MovieServlet extends HttpServlet {
    private static final Gson gson=new GsonBuilder().create();


    DbConnection db=new DbConnection();
    private static final MovieService movieService =new MovieServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getPathInfo()==null){
            List<Movie> movie=movieService.getMovies();

            resp.setStatus(200);
            resp.setHeader("content-type", "application/json");
            resp.getOutputStream().println(gson.toJson(movie));
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Movie movie=gson.fromJson(req.getReader(),Movie.class);
        try {
            movieService.createMovie( movie);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
            resp.setHeader("content-type","application/json");
            resp.getOutputStream().println(gson.toJson(movie));

    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Movie movie=gson.fromJson(req.getReader(),Movie.class);
        try {
            movieService.updateMovie(movie);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("content-type","application/json");
        resp.getOutputStream().println(gson.toJson(movie));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Movie movie =gson.fromJson(req.getReader(),Movie.class);
        try {
            movieService.DeleteMovie(movie);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("content-type","application/json");
        resp.getOutputStream().println(gson.toJson(movie));

    }


}
=======
package com.servlets;

import com.db.DbConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Movie;
import com.service.MovieService;
import com.service.MovieServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class MovieServlet extends HttpServlet {
    private static final Gson gson=new GsonBuilder().create();


    DbConnection db=new DbConnection();
    private static final MovieService movieService =new MovieServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getPathInfo()==null){
            List<Movie> movie=movieService.getMovies();

            resp.setStatus(200);
            resp.setHeader("content-type", "application/json");
            resp.getOutputStream().println(gson.toJson(movie));
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Movie movie=gson.fromJson(req.getReader(),Movie.class);
        try {
            movieService.createMovie( movie);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
            resp.setHeader("content-type","application/json");
            resp.getOutputStream().println(gson.toJson(movie));

    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Movie movie=gson.fromJson(req.getReader(),Movie.class);
        try {
            movieService.updateMovie(movie);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("content-type","application/json");
        resp.getOutputStream().println(gson.toJson(movie));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Movie movie =gson.fromJson(req.getReader(),Movie.class);
        try {
            movieService.DeleteMovie(movie);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("content-type","application/json");
        resp.getOutputStream().println(gson.toJson(movie));

    }


}
>>>>>>> 99590ce5a409d91f3c9ed95608f6878dac66884f
