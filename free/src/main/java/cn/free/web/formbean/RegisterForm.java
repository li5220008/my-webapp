package cn.free.web.formbean;

import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by free on 14-3-1.
 */
public class RegisterForm {
    private String username;
    private String password;
    private String repassword;
    private String nickname;
    private String email;
    private String birthday;
    private Map errors = new HashMap();

    private String checkcode;

    public Map getErrors() {
        return errors;
    }

    public void setErrors(Map errors) {
        this.errors = errors;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public boolean validate() {
        boolean isOk = true;
        if (this.username == null || "".equals(this.username.trim())) {
            isOk = false;
            errors.put("username", "用户名不能为空！");
        }else {
            if(!this.username.matches("[a-zA-Z]{2,8}")){
                isOk = false;
                errors.put("username", "用户名必须是2到8位的英文字符");
            }
        }
        if(this.password == null || "".equals(this.password.trim())){
            isOk = false;
            errors.put("password", "秘密不能为空！");
        }else{
            if(!this.password.matches("\\d{3,8}")){
                isOk = false;
                errors.put("password", "秘密必须是3到8位的数字组成！");
            }
        }
        if(this.repassword == null || "".equals(this.repassword.trim())){
            isOk = false;
            errors.put("repassword", "确认秘密不能为空！");
        }else{
            if(!this.repassword.equals(this.password)/*this.repassword != this.password*/){
                isOk = false;
                errors.put("repassword", "两次秘密输入不一致！");
            }
        }

        if(this.email == null || "".equals(this.email.trim())){
            isOk = false;
            errors.put("email", "邮箱不能为空！");
        }else {
            //lid55@qq.com.cn
            if(!this.email.matches("\\A\\w+@\\w+(\\.\\w+)+\\z")){
                isOk = false;
                errors.put("email", "邮箱格式不正确！");
                System.out.println("email");

            }
        }
        if(this.birthday == null || "".equals(this.email.trim())){
            isOk = false;
            errors.put("email", "日期不能为空");
        }else {
            DateLocaleConverter dc = new DateLocaleConverter();
            try {
                dc.convert(this.birthday);
            } catch (Exception e) {
                isOk = false;
                errors.put("email", "日期格式不正确！");
                //e.printStackTrace();
            }
        }

        if(this.nickname == null || "".equals(this.nickname.trim())){
            isOk = false;
            errors.put("nickname", "昵称不能为空");
        }else {
            if(!this.nickname.matches("[\u4e00-\u9fa5]+")){
                isOk = false;
                errors.put("nickname", "昵称必须是中文字符！");
            }

        }
        if(this.checkcode == null || "".equals(this.checkcode.trim())){
            isOk = false;
            errors.put("checkcode", "昵称不能为空");
        }else {
            /*if(!this.nickname.matches("[\u4e00-\u9fa5]+")){
                isOk = false;
                errors.put("nickname", "昵称必须是中文字符！");
            }*/

        }
        return isOk;
    }
}
