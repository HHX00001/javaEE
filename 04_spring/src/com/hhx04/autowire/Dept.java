package com.hhx04.autowire;

/**
 * @author hhxStellar
 * @date 2021/9/13-16:01
 */
public class Dept {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
