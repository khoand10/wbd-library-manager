package controller;

import dao.BookDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletBookManager",urlPatterns = "/book")
public class ServletBookManager extends HttpServlet {
    BookDao dao = new BookDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        int id = 0;
        id= Integer.parseInt(request.getParameter("id"));
        switch (action){
            case "info":
                request.setAttribute("book_detail",dao.getBook(id));
                break;
        }
        sendData(request);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request,response);
    }
    public void sendData(HttpServletRequest request){
        request.setAttribute("list",dao.getAllBook());
        request.setAttribute("categories",dao.getAllCategory());
        request.setAttribute("authors",dao.getAllAuthor());
        request.setAttribute("publishers",dao.getAllPublisher());
    }
}
