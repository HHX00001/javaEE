package com.hhx04.bean;

/**
 * @author hhxStellar
 * @date 2021/9/13-14:15
 */
public class Orders {
    private String oderName;

    public Orders() {
        System.out.println("1、空参构造方法创建实例");
    }

    public String getOderName() {
        return oderName;
    }

    public void setOderName(String oderName) {
        this.oderName = oderName;
        System.out.println("2、调用set方法设置属性值");
    }

    public void initMethod() {
        System.out.println("3、调用初始化方法。。。。");
    }

    public void destroyMethod(){
        System.out.println("5、调用销毁方法。。。。");
    }
}
