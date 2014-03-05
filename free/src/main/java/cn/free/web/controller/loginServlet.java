package cn.free.web.controller;

import cn.free.domain.User;
import cn.free.service.BusinessService;
import cn.free.service.impl.BusinessServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理登陆的请求
 * Created by free on 14-3-2.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        BusinessService service = new BusinessServiceImpl();
        User user = new User();
        user = service.login(username, password);
        if(user !=null){
            req.getSession().setAttribute("user",user);
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
            return ;
        }
        /*user.setUsername(username);
        user.setPassword(password);
        req.setAttribute("error","用户名或密码错误！");
        req.setAttribute("user",user);
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,resp);*/

        req.setAttribute("message","用户不存在，登陆失败！");
        req.getRequestDispatcher("/WEB-INF/message.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
