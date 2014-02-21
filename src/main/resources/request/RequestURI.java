package request;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-21
 * Time: 上午10:31
 */
public class RequestURI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //getHead(req);

    }

    private void getHead(HttpServletRequest req) {
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getQueryString());
        System.out.println(req.getRemoteAddr());
        System.out.println(req.getRemoteUser());
        System.out.println(req.getRemoteHost());
        System.out.println(Arrays.asList(req.getCookies()));
        System.out.println("------------local---------------");
        System.out.println(req.getLocalPort());
        System.out.println(req.getMethod());
        System.out.println("---------header-------------------");
        System.out.println(req.getHeader("Accept-Encoding"));
        System.out.println(req.getHeader("Accept-Language"));
        System.out.println(req.getHeader("Cookie"));
        System.out.println(req.getHeader("Host"));
        System.out.println("---------------enumerations------------------");
        Enumeration e = req.getHeaders("Accept-Encoding");
        while (e.hasMoreElements()){
            String value = (String)e.nextElement();
            System.out.println(value);
        }

        e=req.getHeaderNames();
        while (e.hasMoreElements()){
            String name = (String)e.nextElement();
            String value = (String)req.getHeader(name);

            System.out.println(name+"-"+value);
        }
    }
}
