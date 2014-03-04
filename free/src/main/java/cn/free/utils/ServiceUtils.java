package cn.free.utils;


import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-28
 * Time: 下午2:36
 */
public class ServiceUtils {

    /**
     * md5加密
     *
     * @return
     */
    public static String md5(String message) {
        try {
            if(message == null) return null;
            //获取一个消息加密算法
            MessageDigest md = MessageDigest.getInstance("md5");
            //把消息转换成字节数组，进行加密
            byte[] digest = md.digest(message.getBytes());
            //新建一个BASE64编码器
            BASE64Encoder encoder = new BASE64Encoder();
            //对字节数组进行BASE64编码
            return encoder.encode(digest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
