/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmth.bean;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author BuiNgocTruong
 */
public class User {
    private int userId;
    private String fullName;
    private String nickName;
    private Date birthDay;
    private int gender;
    private String email;
    private String address;
    private String phoneNumber;
    private String avatarUrl;

    public User() {
    }

    public User(int userId, String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String avatarUrl) {
        this.userId = userId;
        this.fullName = fullName;
        this.nickName = nickName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.avatarUrl = avatarUrl;
    }

    public User(int userId, String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber) {
        this.userId = userId;
        this.fullName = fullName;
        this.nickName = nickName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public User(String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User(String fullName, String nickName, Date birthDay, int gender, String email, String address, String phoneNumber, String avatarUrl) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.avatarUrl = avatarUrl;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    
    public String getBirthdayToString(){
        return new SimpleDateFormat("yyyy-MM-dd").format(birthDay);
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
