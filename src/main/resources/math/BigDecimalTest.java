package math;

import java.math.BigDecimal;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-26
 * Time: 下午1:48
 */
public class BigDecimalTest {
    public static void main(String[] args){
        double a = 0.1;
        double b = 0.0006;
        System.out.println(a + b);
        BigDecimal bd = new BigDecimal("0.000000000000556687422001");
        BigDecimal bd1 = new BigDecimal("0.0006223358555555555555");
        System.out.println(bd.add(bd1).toString());
    }
}
