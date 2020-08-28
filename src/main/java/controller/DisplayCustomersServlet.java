package controller;

import model.Customers;
import service.CustomersService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DisplayCustomersServlet",urlPatterns = "/index")
public class DisplayCustomersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customers> list = CustomersService.getAllCustomers();
        request.setAttribute("listCustomers",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/customers/list.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
