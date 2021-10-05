package com.hhx08.bean;

/**
 * @author hhxStellar
 * @date 2021/9/14-14:58
 */
public class User {
    private int userId;
    private String userName;
    private int userAccount;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(int userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAccount=" + userAccount +
                '}';
    }
}
