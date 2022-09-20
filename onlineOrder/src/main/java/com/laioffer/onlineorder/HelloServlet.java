package com.laioffer.onlineorder;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("username");
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>Hello~~~" + userName + "!!!</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}