import cn.free.domain.User;
import cn.free.exception.UserExistException;
import cn.free.service.BusinessService;
import cn.free.service.impl.BusinessServiceImpl;
import junit.framework.TestCase;

import java.util.Date;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 下午3:38
 */
public class ServiceTest extends TestCase {
    public void testRegist() throws UserExistException {
        User user = new User();
        user.setId("4");
        user.setUsername("xiaoming");
        user.setPassword("123");
        user.setEmail("ll@qq.com");
        user.setBirthday(new Date());
        user.setNickname("笨蛋");

        BusinessService service = new BusinessServiceImpl();
        service.register(user);
    }

    public void testLogin() {
        BusinessService service = new BusinessServiceImpl();
        User user = service.login("kk1", "123");
        System.out.println(user);
    }
}
