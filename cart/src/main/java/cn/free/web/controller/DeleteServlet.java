package cn.free.web.controller;
import cn.free.domain.Cart;
import cn.free.service.impl.BusinessService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-6
 * Time: 上午9:28
 */
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        BusinessService service = new BusinessService();
        Cart cart = (Cart)req.getSession().getAttribute("cart");
        service.deleteBook(id, cart);
        //删除成功！
        req.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
