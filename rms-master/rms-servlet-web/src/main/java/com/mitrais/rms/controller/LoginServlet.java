package com.mitrais.rms.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends AbstractController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        String path = getTemplatePath(req.getServletPath());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
        requestDispatcher.forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        String uname = req.getParameter("username");
        String upass = req.getParameter("userpass");
	if(uname.equals("admin") && upass.equals("admin")){
            res.sendRedirect("/rms-servlet-web/index.jsp");
	}else{
            req.setAttribute("errorMessage", "Username or Password Incorrect!");
            req.getRequestDispatcher("/").forward(req, res);
        }
    }
}
