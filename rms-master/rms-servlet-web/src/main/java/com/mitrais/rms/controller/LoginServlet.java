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
import java.util.Optional;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends AbstractController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        HttpSession currSession = req.getSession(false);
        String path = "";
        if(currSession != null){
            User userActive = (User) currSession.getAttribute("currentuser");
            System.out.println("Current session: " + userActive.getUserName() + 
                    " | " + userActive.getPassword());
            res.sendRedirect("/rms-servlet-web/index.jsp");
        }else{
            System.out.println("Current session has been expired !");
            path = getTemplatePath(req.getServletPath());
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
            requestDispatcher.forward(req, res);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        String uname = req.getParameter("username");
        String upass = req.getParameter("userpass");
        Boolean result = checkDataFromDB(uname, upass);
	if(result == true){
            HttpSession newSession = req.getSession(true);
            newSession.setAttribute("currentuser", new User(uname, upass));
            res.sendRedirect("/rms-servlet-web/index.jsp");
	}else{
            String path = getTemplatePath(req.getServletPath());
            req.setAttribute("errorMessage", "Username or Password Incorrect !");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
            requestDispatcher.forward(req, res);
        }
    }
    
    private boolean checkDataFromDB(String u, String p){
        UserDao userDao = UserDaoImpl.getInstance();
        Optional<User> data = userDao.findByUserData(u, p);
        if(data != null){
            return true;
        }else{
            return false;
        }
    }
}
