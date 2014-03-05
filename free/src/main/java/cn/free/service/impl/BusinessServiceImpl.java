package cn.free.service.impl;

import cn.free.dao.UserDao;
import cn.free.dao.impl.UserDaoImpl;
import cn.free.domain.User;
import cn.free.exception.UserExistException;
import cn.free.service.BusinessService;
import cn.free.utils.ServiceUtils;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 下午2:14
 */
public class BusinessServiceImpl implements BusinessService {

    //调用数据控制层
    private UserDao dao = new UserDaoImpl();//要实现彻底解耦 1，工厂方法 1，依赖注入（spring guice）

    /**
     * 对web层提供注册服务
     * @param user
     */
    public void register(User user) throws UserExistException {
        boolean b = dao.find(user.getUsername());
        if(!b){
            user.setPassword(ServiceUtils.md5(user.getPassword()));
            dao.add(user);
        }else {
            throw new UserExistException();//发现要注册的用户已经存在，则给web层抛出编译时异常,提醒web层处理这个异常，给用户友好提示。
        }
    }

    /**
     * 对web层提供登陆服务
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password){
        password = ServiceUtils.md5(password);
        return dao.fetchUser(username,password);
    }

}
