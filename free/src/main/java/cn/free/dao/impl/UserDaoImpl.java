package cn.free.dao.impl;

import cn.free.dao.UserDao;
import cn.free.domain.User;
import cn.free.utils.XmlUtils;
import org.dom4j.Document;
import org.dom4j.Element;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-27
 * Time: 下午3:14
 */
public class UserDaoImpl implements UserDao {
    public void add(User user) {
        try {
            Document document = XmlUtils.getDocument();
            Element root = document.getRootElement();
            Element userTag = root.addElement("user");
            userTag.addAttribute("id", user.getId());
            userTag.addAttribute("username", user.getUsername());
            userTag.addAttribute("password", user.getPassword());
            userTag.addAttribute("email", user.getEmail());
            userTag.addAttribute("birthday", user.getBirthday() == null ? "" : user.getBirthday().toLocaleString());
            userTag.addAttribute("nickname", user.getNickname());
            XmlUtils.write2Xml(document);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public User fetchUser(String username, String password){
        try {
            Document document = XmlUtils.getDocument();
            Element element = (Element) document.selectSingleNode("//user[@username='" + username + "' and @password='" + password + "']");
            if(element==null){
                return null;
            }
            User user = new User();
            user.setId(element.attributeValue("id"));
            user.setUsername(element.attributeValue("username"));
            user.setEmail(element.attributeValue("email"));
            String date = element.attributeValue("birthday");
            if("".equals(date)|| date ==null){
                user.setBirthday(null);
            }else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = sdf.parse(date);
                user.setBirthday(parse);
            }
            user.setNickname(element.attributeValue("nickname"));
            return user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean find(String username) {
        try {
            Document document = XmlUtils.getDocument();
            Element element = (Element) document.selectSingleNode("//user[@username='" + username + "']");
            if(element==null){
                return false;
            }else {
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void del(String id){

    }
}
