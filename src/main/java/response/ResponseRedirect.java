package response;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-21
 * Time: 上午9:02
 */
public class ResponseRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.getWriter();
        resp.getWriter();*/
        /*resp.getOutputStream();
        resp.getOutputStream();*/
        /*
        重定向的特点
        1，浏览器会向服务器放送两次请求
        2，用重定向技术，浏览器地址栏会发生变化

        resp.setStatus(302);
        resp.setHeader("location","/index.Jsp");*/
        resp.sendRedirect("/index.Jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
