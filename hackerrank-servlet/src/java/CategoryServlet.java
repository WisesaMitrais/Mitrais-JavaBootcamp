import model.*;
import utility.*;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/category"})
public class CategoryServlet extends HttpServlet {
    
    private final Database database = new Database();
    private List<Category> categoryList = new ArrayList<>();
    private Category category = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        String catId = request.getParameter("cat-id");
        PrintWriter out = response.getWriter();
        try{
            category = database.showCategory(catId);
            out.println(category.getId() + " - " + category.getName());
        }catch(Exception ex){
            out.println(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("X");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
