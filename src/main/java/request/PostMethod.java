package request;
import dao.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Map;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-21
 * Time: 下午1:49
 */
public class PostMethod extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------------获取数据方式1--------------");
        String username = req.getParameter("username");
        System.out.println(username);

        System.out.println("------------------获取数据方式2--------------");
        Enumeration e = req.getParameterNames();
        while (e.hasMoreElements()){
            String name =(String)e.nextElement();
            String value = req.getParameter(name);
            System.out.println(name+":"+value);
        }
        System.out.println("------------------获取数据方式3--------------");
        String[] usernames = req.getParameterValues("username");
        /*for(String v : usernames){
            System.out.println(v);
        }*/

        for(int i=0;username!=null&&i<usernames.length;i++){
            System.out.println(usernames[i]);
        }

        System.out.println("------------------获取数据方式4--------------");
        Map map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getCheckcode());
        System.out.println("------------------获取数据方式5--------------");
        ServletInputStream in = req.getInputStream();
        int len=0;
        byte[] buf = new byte[1024];
        while ((len=in.read(buf))>0){
            System.out.println(new String(buf,0,len));
        }
    }
}
