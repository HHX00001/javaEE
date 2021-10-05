package com.hhx04.bean;

import java.util.List;

/**
 * @author hhxStellar
 * @date 2021/9/11-19:33
 */
public class Book {
    private String name;
    private List<String> info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", info=" + info +
                '}';
    }
}
