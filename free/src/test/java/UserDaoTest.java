import cn.free.dao.impl.UserDaoImpl;
import cn.free.domain.User;
import org.junit.Test;

import java.util.Date;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 上午11:06
 */
public class UserDaoTest {

    @Test
    public void testAddUser(){
        User user = new User();
        user.setId("2");
        user.setUsername("free");
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setEmail("li@99.com");
        user.setNickname("nick");
        UserDaoImpl udi = new UserDaoImpl();
        udi.add(user);
    }

    @Test
    public void testFetchUser(){
        UserDaoImpl udi = new UserDaoImpl();
        User free = udi.fetchUser("aa", "123");
        System.out.println(free);
    }
    @Test
    public void testFindUser(){
        UserDaoImpl udi = new UserDaoImpl();
        System.out.println(udi.find("free"));
    }
}
