package com.mitrais.rms.controller;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;

@WebServlet("/users/*")
public class UserServlet extends AbstractController{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{        
        HttpSession currSession = req.getSession(false);
        if(currSession != null){
            String path;
            User userActive = (User) currSession.getAttribute("currentuser");
            System.out.println("Current session: " + userActive.getUserName() + 
                    " | " + userActive.getPassword());
            path = getTemplatePath(req.getServletPath() + req.getPathInfo());
            if ("/list".equalsIgnoreCase(req.getPathInfo())){
                UserDao userDao = UserDaoImpl.getInstance();
                List<User> users = userDao.findAll();
                req.setAttribute("users", users);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
                requestDispatcher.forward(req, res);
            }else if("/form".equalsIgnoreCase(req.getPathInfo())){
                Optional<User> data;
                User user;
                if(req.getParameter("id") == null){
                    user = null;
                }else{
                    long id = Long.parseLong(req.getParameter("id"));
                    UserDao userDao = UserDaoImpl.getInstance();
                    data = userDao.find(id);
                    user = data.get();
                }
                req.setAttribute("user", user);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
                requestDispatcher.forward(req, res);
            }else if("/delete".equalsIgnoreCase(req.getPathInfo())){
                UserDao userDao = UserDaoImpl.getInstance();
                long id = Long.parseLong(req.getParameter("id"));
                String uname = req.getParameter("user");
                String upass = req.getParameter("pass");
                userDao.delete(new User(id, uname, upass));
                res.sendRedirect("/rms-servlet-web/users/list");
            }
        }else{
            System.out.println("Current session has been expired !");
            res.sendRedirect("/rms-servlet-web/");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        HttpSession currSession = req.getSession(false);
        if(currSession != null){
            User userActive = (User) currSession.getAttribute("currentuser");
            System.out.println("Current session: " + userActive.getUserName() + 
                    " | " + userActive.getPassword());
            if ("/form".equalsIgnoreCase(req.getPathInfo())){
                UserDao userDao = UserDaoImpl.getInstance();
                String button = req.getParameter("button");
                String uname = req.getParameter("username");
                String upass = req.getParameter("userpass");
                switch(button){
                    case "Create":
                        userDao.save(new User(uname, upass));
                        break;
                    case "Update":
                        long id = Long.parseLong(req.getParameter("id"));
                        userDao.update(new User(id, uname, upass));
                        break;
                }
                res.sendRedirect("/rms-servlet-web/users/list");
            }
        }else{
            System.out.println("Current session has been expired !");
            res.sendRedirect("/rms-servlet-web/");
        }
    }
}
