import cn.free.web.formbean.*;
import org.junit.Test;

import java.util.Map;

/**
 * Created by free on 14-3-1.
 */
public class ResterFormTest {
    @Test
    public void testForm(){
        RegisterForm form = new RegisterForm();
        form.setUsername("aab");
        form.setEmail("li@qq.com");
        form.setBirthday("2011-01-02");
        form.setPassword("123");
        form.setRepassword("123");
        form.setCheckcode("2234");
        form.setNickname("ee");
        System.out.println(form.validate());
        Map erros = form.getErros();
        System.out.println(erros);
    }
}
