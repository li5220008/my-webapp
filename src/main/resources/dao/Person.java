package dao;

import java.util.Date;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-2-26
 * Time: 上午8:40
 */
public class Person {
    private String name = "aa";
    private int age;

    public Person(String name) {
        this.name = name;
    }
    public Person() {
    }

    private Date birthday;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
