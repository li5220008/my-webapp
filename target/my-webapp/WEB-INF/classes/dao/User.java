package dao;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-21
 * Time: 下午2:23
 */
public class User {
    private String[] username;
    private String password;
    private String checkcode;

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public String[] getUsername() {
        return username;
    }

    public void setUsername(String[] username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
