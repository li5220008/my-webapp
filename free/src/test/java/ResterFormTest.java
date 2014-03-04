import cn.free.web.formbean.RegisterForm;
import junit.framework.TestCase;

import java.util.Map;

/**
 * Created by free on 14-3-1.
 */
public class ResterFormTest extends TestCase {

    public void testForm() {
        RegisterForm form = new RegisterForm();
        form.setUsername("aab");
        form.setEmail("li@qq.com");
        form.setBirthday("2011-01-02");
        form.setPassword("1233");
        form.setRepassword("1233");
        form.setCheckcode("2234");
        form.setNickname("中国");
        System.out.println(form.validate());
        Map erros = form.getErrors();
        System.out.println(erros);
        System.out.println(("1233" == form.getPassword()));

        /*String s1 = "ab";
        String s2 = "ab";
        System.out.println(s1==s2);
        String s3 = "abc";
        String s4 = "ab"+"c";
        System.out.println(s3==s4);

        String a = "abc";
        String b = "ab";
        String c = b + "c";
        System.out.println(a==c);*/

        /*String s1 = "Monday";
        String s2 = "Monday";
        if (s1 == s2)
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");*/

        /*String s1 = "Monday";
        String s2 = new String("Monday");
        if (s1 == s2)
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");
        if (s1.equals(s2))
            System.out.println("s1 equals s2");
        else
            System.out.println("s1 not equals s2");*/

        /*String s1 = "Monday";
        String s2 = new String("Monday");
        s2 = s2.intern();
        if (s1 == s2)
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");
        if (s1.equals(s2))
            System.out.println("s1 equals s2");
        else
            System.out.println("s1 not equals s2");*/

    }
}
