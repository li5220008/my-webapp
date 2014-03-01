package request;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-21
 * Time: 下午3:08
 */
public class RequestForm extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        test(req);

    }
    //解决POST乱码
    private void test(HttpServletRequest req) {
        //req.setCharacterEncoding("UTF-8");//只对POST方法有效
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        System.out.println(req.getParameter("checkcode"));
        System.out.println(req.getParameter("gender"));
        System.out.println(req.getParameter("address"));
        String[] likes = req.getParameterValues("likes");
        for(int i=0;likes !=null&&i<likes.length;i++){
            System.out.println(likes[i]);
        }
        System.out.println(req.getParameter("description"));
        System.out.println(req.getParameter("hidden"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String encodeName = new String(username.getBytes("iso8859-1"),"UTF-8");
        System.out.println(encodeName);
        doPost(req, resp);
    }
}
