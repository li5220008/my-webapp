package response;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Random;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-20
 * Time: 下午4:20
 */
public class ResponseRefresh extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        test2(req, resp);
    }

    private void test2(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException {
        String message ="<meta http-equiv='refresh' content='3;url=/index.jsp'>恭喜你，登陆成功，本浏览器将在3秒钟后跳转到主页，如果没有跳转请点击<a href=''>超链接</a>";
        this.getServletContext().setAttribute("message",message);
        this.getServletContext().getRequestDispatcher("/message.jsp").forward(req, resp);

    }

    private void test1(HttpServletResponse resp) throws IOException {
        resp.setHeader("refresh","3;url='/index.jsp'") ;
        String data = new Random().nextInt()+"";
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write(data+"恭喜你，登陆成功，本浏览器将在3秒钟后跳转到主页，如果没有跳转请点击<a href=''>超链接</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
