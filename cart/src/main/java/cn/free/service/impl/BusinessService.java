package cn.free.service.impl;

import cn.free.dao.impl.BookDao;
import cn.free.domain.Book;
import cn.free.domain.Cart;
import cn.free.domain.CartItem;

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
    //删除购物车中的购物项
    public void deleteBook(String id,Cart cart){
        cart.getMap().remove(id);
    }

    public void clearCart(Cart cart){
        cart.getMap().clear();
    }

}
