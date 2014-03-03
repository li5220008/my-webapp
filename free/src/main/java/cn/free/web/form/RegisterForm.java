package cn.free.web.form;

import java.util.Date;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 下午6:14
 */
public class RegisterForm {
    private String username;
    private String password;
    private String repassword;
    private Date birthday;
    private String nickname;
    private String checkcode;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }
}
