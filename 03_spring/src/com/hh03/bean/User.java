package com.hh03.bean;

/**
 * @author hhxStellar
 * @date 2021/9/11-13:20
 */
public class User {
    private int age;
    private String username;
    private String address;

    public User() {
    }

    public User(int age, String username) {
        this.age = age;
        this.username = username;
    }

    public void add() {
        System.out.println("add....");
    }

    public String showInfo() {
        return "User{" +
                "age=" + age +
                ", username='" + username + '\'' +
                ", height=" + address +
                '}';
    }

    public int getAge() {
        return age;
    }

    //set方法实现注入
    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
