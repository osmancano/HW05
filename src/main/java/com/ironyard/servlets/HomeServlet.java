package com.ironyard.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by osmanidris on 1/17/17.
 */
@WebServlet(name = "HomeServlet",urlPatterns = "/changeUserName")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        HttpSession session = request.getSession(false);
        session.removeAttribute("user");
        session.setAttribute("user",username);
        String result = "Username changed Sucessfuly";
        request.setAttribute("result",result);
        request.getRequestDispatcher("/changeUser.jsp").forward(request,response);
    }
}
