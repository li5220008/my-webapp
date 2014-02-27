package dao;

import java.math.BigDecimal;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-26
 * Time: 下午2:21
 */
public class Caculator {
    private String param1 ="0";
    private String param2 ="0";
    private char oprator ='+';
    private String result;

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public char getOprator() {
        return oprator;
    }

    public void setOprator(char oprator) {
        this.oprator = oprator;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void caculate(){
        BigDecimal first = new BigDecimal(param1);
        BigDecimal second = new BigDecimal(param2);
        switch (oprator){
            case '+':
            {
                this.result = first.add(second).toString();
                break;
            }
            case '-':
            {
                this.result = first.subtract(second).toString();
                break;
            }
            case '*':
            {
                this.result = first.multiply(second).toString();
                break;
            }
            case '/':
            {
                if(second.doubleValue()==0){
                    throw new RuntimeException("被除数不能为0");
                }
                this.result = first.divide(second,20,BigDecimal.ROUND_HALF_UP).toString();
                break;
            }
            default:{
                throw new RuntimeException("运算符只能是加减乘除!");
            }
        }
    }
}
