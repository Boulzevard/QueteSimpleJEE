package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello", "/custom-hello"})
public class SimpleHelloServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter( "firstname" );
        String lastname = request.getParameter( "lastname" );
        int date = Integer.parseInt(request.getParameter( "heure"));

        PrintWriter out = response.getWriter();

        String message = "";

        if (date >= 20 || date < 2){
            message += "Good Night ";
        }

        else if (date < 12) {
            message += "Good Morning ";
        }
        else{
            message += "Good afternoon ";
        }

        message += firstname + " " + lastname;

        request.setAttribute("monmessage", message);


        this.getServletContext().getRequestDispatcher("/custom-hello.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/hello-form.jsp")
                .forward(request, response);
    }

}
