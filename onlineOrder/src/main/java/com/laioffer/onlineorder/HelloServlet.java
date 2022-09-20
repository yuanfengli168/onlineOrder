package com.laioffer.onlineorder;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

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
        response.setContentType("application/json");
        JSONObject customer = new JSONObject();
        customer.put("email", "sun@laioffer.com");
        customer.put("first_name", "rick");
        response.getWriter().print(customer);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Read customer information from request body.
        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
        String email = jsonRequest.getString("email");

        // print customer information to IDE console
        System.out.println("Email is: " + email);

        // return status = ok as response body to the client
        response.setContentType("application/json");
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("status", "ok");
        response.getWriter().print(jsonResponse);
    }

    public void destroy() {
    }
}