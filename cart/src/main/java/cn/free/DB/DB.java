package cn.free.db;

import cn.free.domain.Book;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 下午1:16
 */
public class DB {
    public static Map<String,Book> map = new LinkedHashMap<String, Book>();
    static {
       map.put("1",new Book("1","java开发","金庸",111,"好书阿！"));
       map.put("2",new Book("2","php开发","金庸1",112,"好书阿！"));
       map.put("3",new Book("3","ajax开发","金庸3",141,"好书阿！"));
       map.put("4",new Book("4","bootstrap开发","金庸4",11,"好书阿！"));
       map.put("5",new Book("5","shell开发","金庸5",115,"好书阿！"));
       map.put("6",new Book("6","mysql开发","金庸6",117,"好书阿！"));
       map.put("7",new Book("7","c#开发","金庸7",131,"好书阿！"));
    }

    public static Map<String,Book> getAll(){
        return map;
    }
}
