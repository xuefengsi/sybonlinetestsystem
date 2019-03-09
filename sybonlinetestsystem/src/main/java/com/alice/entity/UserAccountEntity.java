package com.alice.entity;

/**
 * 用户账号信息实体
 */
public class UserAccountEntity {

    private String number;

    private String password;

    private String authority;

    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }

    public String getAuthority() {
        return authority;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
