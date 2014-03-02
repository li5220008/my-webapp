package cn.free.web.controller;

import cn.free.domain.User;
import cn.free.utils.WebUtils;
import cn.free.web.formbean.RegisterForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by free on 14-3-2.
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        RegisterForm form = WebUtils.request2Bean(req, RegisterForm.class);
        boolean validate = form.validate();
        if(!validate){
            req.setAttribute("form",form);
            req.getRequestDispatcher("/WEB-INF/jsp/").forward(req,resp);
        }

        User user = new User();
        WebUtils.copyBean(form,user);
        user.setId(WebUtils.generateID());

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
