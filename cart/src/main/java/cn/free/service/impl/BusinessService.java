package cn.free.service.impl;

import cn.free.dao.impl.BookDao;
import cn.free.domain.Book;

import java.util.Map;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 下午1:37
 */
public class BusinessService {
    private BookDao dao = new BookDao();
    public Map getAllBook() {
        return dao.getAll();
    }
    public Book findBook(String id){
        return dao.findBook(id);
    }

}
