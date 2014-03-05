package cn.free.web.controller;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 上午9:25
 */
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session !=null){
            session.removeAttribute("user");
        }
        //注销成功，跳到全局消息显示页面，显示注销成功消息，并控制消息显示页面过3秒后跳转到首页
        req.setAttribute("message","注销成功！ <meta http-equiv='refresh' content='3;url="+req.getContextPath()+"/index.jsp'>");
        req.getRequestDispatcher("/WEB-INF/message.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
