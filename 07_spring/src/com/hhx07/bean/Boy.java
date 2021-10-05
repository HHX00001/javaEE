package com.hhx07.bean;

/**
 * @author hhxStellar
 * @date 2021/9/14-10:18
 */
public class Boy {
    int id;
    String boyName;
    int userCP;

    public Boy() {
    }

    public Boy(int id, String boyName, int userCP) {
        this.id = id;
        this.boyName = boyName;
        this.userCP = userCP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public int getUserCP() {
        return userCP;
    }

    public void setUserCP(int userCP) {
        this.userCP = userCP;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "id=" + id +
                ", boyName='" + boyName + '\'' +
                ", userCP=" + userCP +
                '}';
    }
}
