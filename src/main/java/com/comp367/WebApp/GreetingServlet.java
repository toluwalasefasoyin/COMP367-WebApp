package com.comp367.WebApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get current hour
        int hour = LocalTime.now().getHour();

        String greeting;
        if (hour < 12) {
            greeting = "Good morning, Toluwalase, Welcome to COMP367!";
        } else {
            greeting = "Good afternoon, Toluwalase, Welcome to COMP367!";
        }

        // Print the greeting
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + greeting + "</h1>");
        out.println("</body></html>");
        out.close();
    }
}