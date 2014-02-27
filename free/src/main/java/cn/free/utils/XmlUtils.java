package cn.free.utils;

import org.dom4j.Document;

import java.net.URL;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-27
 * Time: 下午5:16
 */
public class XmlUtils {
    private static String path;
    static {
        path = XmlUtils.class.getClassLoader().getResource("user.xml").getPath();
    }

    public static Document getDocument(){
        return null;
    }
    public static void writeXml(Document document){

    }
}
