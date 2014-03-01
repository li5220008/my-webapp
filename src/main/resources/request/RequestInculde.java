package request;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc:用include 实现页面包含
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-24
 * Time: 上午10:53
 */
public class RequestInculde extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/public/head.Jsp").include(req, resp);
        resp.getWriter().write("hhhllkakall<br/>");
        req.getRequestDispatcher("/public/foot.Jsp").include(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
