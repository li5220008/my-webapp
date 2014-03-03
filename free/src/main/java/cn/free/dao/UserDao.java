package cn.free.dao;

import cn.free.domain.User;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 下午2:03
 */
public interface UserDao {
    void add(User user);

    User fetchUser(String username, String password);

    boolean find(String username);

    void del(String id);
}
