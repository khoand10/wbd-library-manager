package controller;

import dao.BookDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCategory",urlPatterns = "/categories")
public class ServletCategory extends HttpServlet {
    BookDao dao = new BookDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list_category",dao.getAllCategory());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/category/view.jsp");
        requestDispatcher.forward(request,response);

    }
}
