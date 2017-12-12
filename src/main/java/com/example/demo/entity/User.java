package com.example.demo.entity;

import com.example.demo.enums.UserSexEnum;

public class User {
    private Long id;

    private String userName;

    private String passWord;

    private UserSexEnum user_sex;

    private String nick_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public UserSexEnum getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(UserSexEnum user_sex) {
        this.user_sex = user_sex;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }
}