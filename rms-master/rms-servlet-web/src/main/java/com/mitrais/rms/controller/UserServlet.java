package com.mitrais.rms.controller;

import com.mitrais.rms.model.User;
import com.mitrais.rms.service.UserService;
import com.mitrais.rms.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/users/*")
public class UserServlet extends AbstractController{

    private UserService USER_SERVICE = UserServiceImpl.getInstance();
    private boolean result;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        String path = getTemplatePath(req.getServletPath() + req.getPathInfo());
        if ("/list".equalsIgnoreCase(req.getPathInfo())){
            List<User> users = USER_SERVICE.findAll();
            req.setAttribute("users", users);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
            requestDispatcher.forward(req, res);
        }else if("/form".equalsIgnoreCase(req.getPathInfo())){
            User user;
            if(req.getParameter("id") == null){
                user = null;
            }else{
                long id = Long.parseLong(req.getParameter("id"));
                user = USER_SERVICE.find(id);
            }
            req.setAttribute("user", user);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
            requestDispatcher.forward(req, res);
        }else if("/delete".equalsIgnoreCase(req.getPathInfo())){
            long id = Long.parseLong(req.getParameter("id"));
            result = USER_SERVICE.delete(id);
            if(result == true){
                res.sendRedirect("/rms-servlet-web/users/list");
            }else{
                req.setAttribute("errorMessage", "Delete Process Failed !");
            }
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        if ("/form".equalsIgnoreCase(req.getPathInfo())){
            String button = req.getParameter("button");
            String uname = req.getParameter("username");
            String upass = req.getParameter("userpass");
            switch(button){
                case "Create":
                    result = USER_SERVICE.save(uname, upass);
                    if(result == true){
                        res.sendRedirect("/rms-servlet-web/users/list");
                    }else{
                        req.setAttribute("errorMessage", "Create Process Failed !");
                    }
                    break;
                case "Update":
                    long id = Long.parseLong(req.getParameter("id"));
                    result = USER_SERVICE.update(id, uname, upass);
                    if(result == true){
                        res.sendRedirect("/rms-servlet-web/users/list");
                    }else{
                        req.setAttribute("errorMessage", "Update Process Failed !");
                    }
                    break;
            }
        }
    }
}
