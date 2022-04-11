<<<<<<< HEAD
package com.servlets;

import com.db.DbConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.MovieService;
import com.service.MovieServiceImpl;

import javax.servlet.http.HttpServlet;

public class TicketServlet extends HttpServlet {
    private static final Gson gson=new GsonBuilder().create();

    DbConnection db=new DbConnection();
    private static final MovieService movieService =new MovieServiceImpl();

}
=======
package com.servlets;

import com.db.DbConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.MovieService;
import com.service.MovieServiceImpl;

import javax.servlet.http.HttpServlet;

public class TicketServlet extends HttpServlet {
    private static final Gson gson=new GsonBuilder().create();

    DbConnection db=new DbConnection();
    private static final MovieService movieService =new MovieServiceImpl();

}
>>>>>>> 99590ce5a409d91f3c9ed95608f6878dac66884f
