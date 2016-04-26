/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmth.bean;

/**
 *
 * @author BuiNgocTruong
 */
public class Comment {
    private int id;
    private int imgId;
    private int userId;
    private String comment;

    public Comment() {
    }

    public Comment(int id, int imgId, int userId, String comment) {
        this.id = id;
        this.imgId = imgId;
        this.userId = userId;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
