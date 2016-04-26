/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmth.bean;

import java.util.Date;

/**
 *
 * @author BuiNgocTruong
 */
public class Account extends User{
    private int id;
    private String username;
    private String password;

    public Account() {
    }
    
    public Account(String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String avatarUrl, String username, String password) {
        super(fullName, nickName, birthDay, gender, email, address, phoneNumber, avatarUrl);
        this.username = username;
        this.password = password;
    }
    
    public Account(int userId, String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String avatarUrl, String username, String password) {
        super(userId, fullName, nickName, birthDay, gender, email, address, phoneNumber, avatarUrl);
        this.username = username;
        this.password = password;
    }
    
    public Account(int id, int userId, String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String avatarUrl, String username, String password) {
        super(userId, fullName, nickName, birthDay, gender, email, address, phoneNumber, avatarUrl);
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public Account(String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String username, String password) {
        super(fullName, nickName, birthDay, gender, email, address, phoneNumber);
        this.username = username;
        this.password = password;
    }
    
    public Account(int userId, String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String username, String password) {
        super(userId, fullName, nickName, birthDay, gender, email, address, phoneNumber);
        this.username = username;
        this.password = password;
    }
    
    public Account(int id, int userId, String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String username, String password) {
        super(userId, fullName, nickName, birthDay, gender, email, address, phoneNumber);
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
