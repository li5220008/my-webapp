import cn.free.dao.UserDao;
import cn.free.dao.impl.UserDaoImpl;
import cn.free.domain.User;
import junit.framework.TestCase;

import java.util.Date;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 上午11:06
 */
public class UserDaoTest extends TestCase {

    public void testAddUser(){
        User user = new User();
        user.setId("3");
        user.setUsername("free");
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setEmail("li@99.com");
        user.setNickname("nick");
        UserDao udi = new UserDaoImpl();
        udi.add(user);
    }

    public void testFetchUser(){
        UserDao udi = new UserDaoImpl();
        User free = udi.fetchUser("free", "123456");
        System.out.println(free);
    }
    public void testFindUser(){
        UserDao udi = new UserDaoImpl();
        System.out.println(udi.find("free"));
    }
}
