package cn.free.web.controller;
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
        //1，表单字段的合法性进行校验(formbean)

        //2，如果校验失败跳转回表单页面，回显失败信息
        //3，如果校验成功，则调用service处理注册请求
        //4，如果service处理不成功，则跳转到注册页面显示注册失败，已经失败原因
        //5，如果注册不成功，并是其他问题引起，则跳转到全局的错误消息页面
        //6，如果处理成功，跳转到全局消息页面，显示注册成功消息！
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
