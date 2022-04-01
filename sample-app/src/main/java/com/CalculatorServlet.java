package com;

/*import javax.servlet.ServletException;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        /*System.out.println("Hello world");*/
        PrintWriter out=resp.getWriter();


        try {
            int i = Integer.parseInt(req.getParameter("n1"));
            int j = Integer.parseInt(req.getParameter("n2"));
            String str=req.getParameter("s");
            if(str.equals("Add")){
            int a = i + j;
            out.print(a);}
            else if(str.equals("Diff")){
                int d=i - j;
                out.print(d);
            }
            else if(str.equals("Mul")){
                int m=i * j;
                out.print(m);
            }
            else if (str.equals("Div")){
                int div=i/j;
                out.print(div);
            }
            else{
                out.print("nothing given ");
            }
        }catch (NumberFormatException e) {
            // log exception and / or notify user
            //System.out.println("At least one invalid number in the given numbers: " + num1 + ", " + num2);
            e.printStackTrace();
            // show an error message to the user somewhere in your frontend
            req.setAttribute("error", "your error message");
        }

}
}
