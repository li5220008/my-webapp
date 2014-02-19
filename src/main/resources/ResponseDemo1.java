import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-19
 * Time: 上午11:03
 */
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        test(resp);
    }

    private void test(HttpServletResponse resp) throws IOException {
        String str = "中国";
        resp.setHeader("Content-Type","text/html; Charset=UTF-8");
        OutputStream out = resp.getOutputStream();
        //out.write("<meta http-equiv='content-type' content='text/html;charset=UTF-8'>".getBytes());
        out.write(str.getBytes("UTF-8"));
        out.close();
    }
}
