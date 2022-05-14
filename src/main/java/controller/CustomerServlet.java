package controller;

import model.Customers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "controller.CustomerServlet", urlPatterns = "/controller.CustomerServlet")
public class CustomerServlet extends HttpServlet {
    List<Customers> customers = new ArrayList<>();
    public void init() throws ServletException{

//        Customers customers1 = new Customers();
//        customers1.setName("huehue");
//        customers1.setDob("1983-08-20");
//        customers1.setAddress("Ha Noi");
//        customers1.setLinkimg("#");
//
//        customers.add(customers1);
        customers.add(new Customers("Mai Van Hoan","1983-08-20","Ha Noi","https://img.nhandan.com.vn/Files/Images/2020/07/26/nhat_cay-1595747664059.jpg"));
        customers.add(new Customers("Nguyen Van Nam","1983-80-21","Bac Giang","https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2021/5/26/913299/Ngan-Ha25.jpg"));
        customers.add(new Customers("Nguyen Thai Hoa","1983-08-22","Nam Dinh","https://img.nhandan.com.vn/Files/Images/2020/07/26/nhat_cay-1595747664059.jpg"));
        customers.add(new Customers("Tran Dang Khoa","1983-08-17","Ha Tay","https://dotobjyajpegd.cloudfront.net/photo/5d3a66f962710e25dc99ffa3_m"));
        customers.add(new Customers("Nguyen Dinh Thi","1983-08-19","Ha Noi","https://cdn.tgdd.vn/Files/2019/01/01/1142002/s8high_800x600.jpg"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerName = "huehue";
        request.setAttribute("customerName",customerName);

        request.setAttribute("customers",customers);
        request.getRequestDispatcher("displayCustomers.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
