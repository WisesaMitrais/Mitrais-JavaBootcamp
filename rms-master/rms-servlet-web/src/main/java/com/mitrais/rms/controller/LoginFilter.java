package com.mitrais.rms.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "*")
public class LoginFilter implements Filter {
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init LoginFilter.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        boolean isUserActive = req.getSession().getAttribute("currentuser") != null;
        if(isUserActive){
            filterChain.doFilter(request, response);
        }else{
            req.setAttribute("errorMessage", "Session expired !");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/");
            requestDispatcher.forward(req, response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("Destroy LoginFilter.");
    }
}
