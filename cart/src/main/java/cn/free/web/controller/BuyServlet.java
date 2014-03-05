package cn.free.web.controller;
import cn.free.domain.Book;
import cn.free.domain.Cart;
import cn.free.service.impl.BusinessService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc: 完成书籍购买
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 下午2:36
 */
public class BuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        BusinessService service = new BusinessService();
        Book book = service.findBook(id);
        //得到用户的购物车
        Cart cart = (Cart)req.getSession().getAttribute("cart");
        if(cart == null){
            cart = new Cart();
            req.getSession().setAttribute("cart",cart);
        }
        //把书放到用户的购物车中
        cart.add(book);
        req.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
