package cn.free.web.controller;
import cn.free.domain.User;
import cn.free.exception.UserExistException;
import cn.free.service.BusinessService;
import cn.free.service.impl.BusinessServiceImpl;
import cn.free.utils.WebUtils;
import cn.free.web.formbean.RegisterForm;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 下午6:03
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //1，表单字段的合法性进行校验(formbean)
        RegisterForm form = new RegisterForm();
        form = WebUtils.request2Bean(req,RegisterForm.class);
        //2，如果校验失败跳转回表单页面，回显失败信息
        boolean b = form.validate();
        if(!b) {
            req.setAttribute("form",form);
            req.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(req,resp);
            return;
        }
        //3，如果校验成功，则调用service处理注册请求
        User user = new User();
        WebUtils.copyBean(form,user); //bean之间拷贝。
        user.setId(WebUtils.generateID());
        BusinessService service = new BusinessServiceImpl();
        try {
            service.register(user);
        } catch (UserExistException e) {
            //4，如果service处理不成功，则跳转到注册页面显示注册失败，失败原因
            form.getErrors().put("username","用户名已经存在！");
            req.setAttribute("form",form);
            req.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(req,resp);
            return;
        } catch (Exception e){
            e.printStackTrace();
            //5，如果注册不成功，并是其他问题引起，则跳转到全局的错误消息页面
            req.setAttribute("message","服务器出现未知错误！");
            req.getRequestDispatcher("/message.jsp").forward(req,resp);
            return;
        }
        //6，如果处理成功，跳转到全局消息页面，显示注册成功消息！
        req.setAttribute("message","注册成功！");
        req.getRequestDispatcher("/WEB-INF/message.jsp").forward(req,resp);
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
