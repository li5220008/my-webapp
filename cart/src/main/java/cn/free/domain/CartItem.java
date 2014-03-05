package cn.free.domain;

/**
 * Desc: 代表购物车里面的商品，以及商品出现的次数
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-3-5
 * Time: 下午2:47
 */
public class CartItem {
    private int quantity;
    private Book book;
    private double price;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.price = this.book.getPrice()*quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
