package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldServlet.class);
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //resp.setHeader("sampleHeader", "val");
        //resp.getWriter().print("");
        //write("Hello world".getBytes());
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("welcome ADMIN");
        logger.info("Debug log message");
        out.close();
    }

}
