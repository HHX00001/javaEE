package com.hh03.bean;

/**
 * @author hhxStellar
 * @date 2021/9/11-16:41
 */
public class Department {
    private String depName;

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depName='" + depName + '\'' +
                '}';
    }
}
