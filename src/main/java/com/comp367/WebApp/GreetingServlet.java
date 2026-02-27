package com.comp367.WebApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type to HTML
        response.setContentType("text/html");

        // Get writer to output HTML
        PrintWriter out = response.getWriter();

        // Get current time
        LocalTime now = LocalTime.now();

        // Determine greeting based on hour
        String greeting;
        if (now.getHour() < 12) {
            greeting = "Good morning, YourName, Welcome to COMP367";
        } else {
            greeting = "Good afternoon, YourName, Welcome to COMP367";
        }

        // Output greeting
        out.println("<html>");
        out.println("<head><title>Greeting</title></head>");
        out.println("<body>");
        out.println("<h1>" + greeting + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}