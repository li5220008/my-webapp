package request;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-24
 * Time: 上午9:19
 */
public class RequestMVC extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data="this my data! ";
        PrintWriter writer = resp.getWriter();
        writer.write(data);
        //writer.close();
        //req.setAttribute("data", data);
        //request也可以实现转发

        //数据在跳转之前会被清空
        req.getRequestDispatcher("/message.Jsp").forward(req,resp);
        return;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
