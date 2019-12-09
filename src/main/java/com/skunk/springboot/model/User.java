package com.skunk.springboot.model;

import java.util.Date;

public class User {
    private Integer uId;
    private String uUsername;
    private String uPassword;
    private String uSex;
    private Date uCreatetime;
    private Integer uCid;

    public User(Integer uId, String uUsername, String uPassword, String uSex, Date uCreatetime, Integer uCid) {
        this.uId = uId;
        this.uUsername = uUsername;
        this.uPassword = uPassword;
        this.uSex = uSex;
        this.uCreatetime = uCreatetime;
        this.uCid = uCid;
    }

    public User() {
        super();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public Date getuCreatetime() {
        return uCreatetime;
    }

    public void setuCreatetime(Date uCreatetime) {
        this.uCreatetime = uCreatetime;
    }

    public Integer getuCid() {
        return uCid;
    }

    public void setuCid(Integer uCid) {
        this.uCid = uCid;
    }
}