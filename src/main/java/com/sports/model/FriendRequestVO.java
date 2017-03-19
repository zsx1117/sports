package com.sports.model;

/**
 * Created by Wentong WANG on 2016/11/21.
 */
public class FriendRequestVO {

    private int user_id;
    private int user_friend_id;
    private String user_name;
    private String request_content;
    private String request_create_time;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRequest_content() {
        return request_content;
    }

    public void setRequest_content(String request_content) {
        this.request_content = request_content;
    }

    public String getRequest_create_time() {
        return request_create_time;
    }

    public int getUser_friend_id() {
        return user_friend_id;
    }

    public void setUser_friend_id(int user_friend_id) {
        this.user_friend_id = user_friend_id;
    }

    public void setRequest_create_time(String request_create_time) {
        this.request_create_time = request_create_time;
    }
}
