import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("/category | servlet of problem category in hacker rank");
        out.println("/type | servlet of problem type in hacker rank");
        out.println("/problem | servlet of problem detail in hacker rank");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("No action for POST /home, see GET /home.");
    }

    @Override
    public String getServletInfo() {
        return "This servlet related to give general information about other servlets.";
    }
}
