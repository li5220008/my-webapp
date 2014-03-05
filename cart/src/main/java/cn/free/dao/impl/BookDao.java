package cn.free.dao.impl;

import cn.free.db.DB;
import cn.free.domain.Book;

import java.util.Map;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 下午1:34
 */
public class BookDao {
    public Map getAll(){
        return DB.getAll();
    }

    public Book findBook(String id){
        return DB.getAll().get(id);
    }
}
