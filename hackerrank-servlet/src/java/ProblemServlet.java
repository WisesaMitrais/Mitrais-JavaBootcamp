import logic.*;
import bean.*;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.util.*;

@WebServlet(urlPatterns = {"/problem"})
public class ProblemServlet extends HttpServlet {
    
    private PrintWriter out;
    private final Database database = new Database();
    private List<Problem> problemList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        String paramCat = request.getParameter("category");
        String paramType = request.getParameter("type");
        try{
            if("0".equals(paramCat) && "0".equals(paramType)){
                problemList = database.getAllProblem();
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
    }

    @Override
    public String getServletInfo() {
        return "This is Problem Servlet to handle HackerRank Problems.";
    }
}
