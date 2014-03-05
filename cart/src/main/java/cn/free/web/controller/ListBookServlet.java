package cn.free.web.controller;
import cn.free.service.impl.BusinessService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Map;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 下午1:44
 */
public class ListBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BusinessService service = new BusinessService();
        Map map = service.getAllBook();
        req.setAttribute("map",map);
        req.getRequestDispatcher("/WEB-INF/jsp/listbook.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
