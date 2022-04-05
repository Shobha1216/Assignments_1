package com.servlets;

import com.db.Dbconn;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.MovieService;
import com.service.MovieServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MovieServlet extends HttpServlet {
    private static final Gson gson=new GsonBuilder().create();

    Dbconn db=new Dbconn();
    private static final MovieService movieService =new MovieServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        movieService.getMovies();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            movieService.createMovie();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        movieService.updateMovie();
    }
}
