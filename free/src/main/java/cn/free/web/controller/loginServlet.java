package cn.free.web.controller;

import cn.free.domain.User;
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
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        BusinessServiceImpl service = new BusinessServiceImpl();
        User user = new User();
        //service.login(usernam, password);
        if(user !=null){
            resp.sendRedirect("/index.jsp");
            return ;
        }
        req.setAttribute("message","用户不存在，登陆失败！");
        req.getRequestDispatcher("/message").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
