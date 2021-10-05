package com.hhx04.autowire;

/**
 * @author hhxStellar
 * @date 2021/9/13-16:01
 */
public class Emp {
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
