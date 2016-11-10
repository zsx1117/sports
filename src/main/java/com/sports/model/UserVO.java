package com.sports.model;

import java.io.Serializable;

/**
 * Created by Gundam on 2016/10/25.
 */
public class UserVO implements Serializable{
    private int user_id;

    private int user_age;

    private String user_name;

    private String user_password;

    private String user_email;

    private int user_sex;

    private String user_imageURL;

    private int user_authority;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_imageURL() {
        return user_imageURL;
    }

    public void setUser_imageURL(String user_imageURL) {
        this.user_imageURL = user_imageURL;
    }

    public int getUser_authority() {
        return user_authority;
    }

    public void setUser_authority(int user_authority) {
        this.user_authority = user_authority;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "user_id=" + user_id +
                ", user_age=" + user_age +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_sex=" + user_sex +
                ", user_imageURL='" + user_imageURL + '\'' +
                ", user_authority=" + user_authority +
                '}';
    }
}

