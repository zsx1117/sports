package com.sports.pojo;

/**
 * Created by Wentong WANG on 2016/11/24.
 */
public class FriendRequest {
    private int user_basic_id;
    private int user_friend_id;
    private String request_message;
    private String request_create_time;

    public int getUser_basic_id() {
        return user_basic_id;
    }

    public void setUser_basic_id(int user_basic_id) {
        this.user_basic_id = user_basic_id;
    }

    public int getUser_friend_id() {
        return user_friend_id;
    }

    public void setUser_friend_id(int user_friend_id) {
        this.user_friend_id = user_friend_id;
    }

    public String getRequest_message() {
        return request_message;
    }

    public void setRequest_message(String request_message) {
        this.request_message = request_message;
    }

    public String getRequest_create_time() {
        return request_create_time;
    }

    public void setRequest_create_time(String request_create_time) {
        this.request_create_time = request_create_time;
    }
}
