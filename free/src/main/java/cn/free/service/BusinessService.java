package cn.free.service;

import cn.free.domain.User;
import cn.free.exception.UserExistException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 上午11:33
 */
public interface BusinessService {
    void register(User user) throws UserExistException;

    User login(String username, String password);
}
