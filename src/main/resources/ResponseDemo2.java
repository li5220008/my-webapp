import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import java.net.URLEncoder;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-19
 * Time: 下午2:39
 */
public class ResponseDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = "中国";
        //控制以什么编码向浏览器写出字符串
        //resp.setCharacterEncoding("UTF-8");
        //指定浏览器用什么编码来解析字符串
        //resp.setHeader("content-type", "text/html;charset=UTF-8");
        /*resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();
        out.write(data);
        out.close();*/
        String path=this.getServletContext().getRealPath("/download/搞笑.gif");
        String name = path.substring(path.lastIndexOf("\\")+1);
        System.out.println(path);
        byte[] bytes = new byte[1024];
        FileInputStream in = new FileInputStream(path);
        OutputStream out = resp.getOutputStream();
        resp.setHeader("content-disposition","attachment:filename="+URLEncoder.encode(name,"UTF-8"));
        int len =0;
        while ((len = in.read(bytes))>0){
            out.write(bytes,0,len);
        }
        in.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
