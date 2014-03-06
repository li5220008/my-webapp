package cn.free.domain;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Desc: 代表用户的购物车
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 下午2:42
 */
public class Cart {
    private Map<String,CartItem> map = new LinkedHashMap<String, CartItem>();
    private double price;//记住购物车所有商品多少钱！

    public void add(Book book){
        CartItem item = map.get(book.getId());
        if(item ==null){
            item=new CartItem();
            item.setBook(book);
            map.put(book.getId(),item);
            item.setQuantity(1);
        } else {
            item.setQuantity(item.getQuantity() + 1);
            /*this.price += book.getPrice();*/
        }
    }

    public Map<String, CartItem> getMap() {
        return map;
    }

    public void setMap(Map<String, CartItem> map) {
        this.map = map;
    }

    public double getPrice() {
        int totalprice = 0;
        for (Map.Entry<String, CartItem> entry : map.entrySet()) {
            CartItem item = entry.getValue();
            totalprice += entry.getValue().getPrice();
        }
        this.price = totalprice;
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
