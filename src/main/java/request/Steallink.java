package request;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-24
 * Time: 上午11:33
 */
public class Steallink extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String referer = req.getHeader("referer");
        if(referer==null || !referer.startsWith("http://localhost")){
            resp.sendRedirect("/fengjie.jsp");
            return;
        }
        String data="looking fengjie!";
        resp.getWriter().write(data);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
