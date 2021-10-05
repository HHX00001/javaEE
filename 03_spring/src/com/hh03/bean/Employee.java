package com.hh03.bean;

/**
 * @author hhxStellar
 * @date 2021/9/11-16:41
 */
public class Employee {
    private String empName;
    private String gender;
    private Department dep;
//    public Department dep; 设置成public，没有getter也没用。

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public Department getDep() {
        return dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", dep=" + dep +
                '}';
    }
}
