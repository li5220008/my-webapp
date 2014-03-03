package cn.free.exception;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 下午2:23
 */
public class UserExistException extends Exception {
    public UserExistException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public UserExistException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public UserExistException(String message, Throwable cause) {
        super(message, cause);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public UserExistException(Throwable cause) {
        super(cause);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
