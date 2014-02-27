package dao;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-27
 * Time: 上午8:54
 */
public class Address {
    private String city;
    private String road;
    private String num;

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
