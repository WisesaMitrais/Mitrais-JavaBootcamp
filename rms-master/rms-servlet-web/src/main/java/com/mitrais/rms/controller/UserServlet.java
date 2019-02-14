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
import javax.servlet.ServletContext;

@WebServlet("/users/*")
public class UserServlet extends AbstractController{

    private final UserService userService = UserServiceImpl.getInstance();
    private boolean result;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        System.out.println(req.getPathInfo());
        String path = getTemplatePath(req.getServletPath() + req.getPathInfo());
        System.out.println(path);
        if ("/list".equalsIgnoreCase(req.getPathInfo())){
            List<User> users = userService.findAll();
            req.setAttribute("users", users);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
            requestDispatcher.forward(req, res);
        }else if(req.getPathInfo().startsWith("/form")){ //("/form".equalsIgnoreCase(req.getPathInfo())){
            User user;
            if(req.getParameter("id") == null){
                user = null;
            }else{
                long id = Long.parseLong(req.getParameter("id"));
                user = userService.find(id);
            }
            req.setAttribute("user", user);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
            requestDispatcher.forward(req, res);
        }else if("/delete".equalsIgnoreCase(req.getPathInfo())){
            long id = Long.parseLong(req.getParameter("id"));
            result = userService.delete(id);
            if(result == true){
                req.setAttribute("successMessage", "Delete User Success.");
//                res.sendRedirect(getContextRoot() +"/users/list");
                path  =  getTemplatePath("/users/list");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
                requestDispatcher.forward(req, res);
            }else{
                req.setAttribute("errorMessage", "Delete User Failed !");
                path  =  getTemplatePath("/users/form?id=" + req.getParameter("id"));
                RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
                requestDispatcher.forward(req, res);
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
                    result = userService.save(uname, upass);
                    if(result == true){
                        req.setAttribute("successMessage", "Create User Success.");
//                        res.sendRedirect(getContextRoot() + "/users/list");
                        String path  =  getTemplatePath("/users/list");
                        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
                        requestDispatcher.forward(req, res);
                    }else{
                        req.setAttribute("errorMessage", "Create User Failed !");
                        String path  =  getTemplatePath("/users/form");
                        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
                        requestDispatcher.forward(req, res);
                    }
                    break;
                case "Update":
                    long id = Long.parseLong(req.getParameter("id"));
                    result = userService.update(id, uname, upass);
                    if(result == true){
                        req.setAttribute("successMessage", "Update User Data Success.");
//                        res.sendRedirect(getContextRoot() + "/users/list");
                        String path  =  getTemplatePath("/users/list");
                        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
                        requestDispatcher.forward(req, res);
                    }else{
                        req.getSession().setAttribute("errorMessage", "Update User Data Failed !");
//                        String path = getTemplatePath("/users/list");
                        res.sendRedirect(getContextRoot() + "/users/list");
//                        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
//                        requestDispatcher.forward(req, res);
                    }
                    break;
            }
        }
    }
    
    private String getContextRoot(){
        ServletContext servletContext = getServletContext();
        return servletContext.getContextPath();
    }
}
