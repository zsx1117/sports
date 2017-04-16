package com.sports.pojo;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
public class SportEvent {

    private int event_id;
    private String event_create_time;
    private String event_end_time;
    private String event_start_time;
    private String event_sport;
    private String event_location;
    private int event_participer_number;
    private String event_description;
    private String event_sport_type;
    private String event_participer;
    private int event_done;
    private int user_basic_id;

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getEvent_create_time() {
        return event_create_time;
    }

    public void setEvent_create_time(String event_create_time) {
        this.event_create_time = event_create_time;
    }

    public String getEvent_end_time() {
        return event_end_time;
    }

    public void setEvent_end_time(String event_end_time) {
        this.event_end_time = event_end_time;
    }

    public String getEvent_start_time() {
        return event_start_time;
    }

    public void setEvent_start_time(String event_start_time) {
        this.event_start_time = event_start_time;
    }

    public String getEvent_sport() {
        return event_sport;
    }

    public void setEvent_sport(String event_sport) {
        this.event_sport = event_sport;
    }

    public String getEvent_location() {
        return event_location;
    }

    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }

    public int getEvent_participer_number() {
        return event_participer_number;
    }

    public void setEvent_participer_number(int event_participer_number) {
        this.event_participer_number = event_participer_number;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public String getEvent_sport_type() {
        return event_sport_type;
    }

    public void setEvent_sport_type(String event_sport_type) {
        this.event_sport_type = event_sport_type;
    }

    public String getEvent_participer() {
        return event_participer;
    }

    public void setEvent_participer(String event_participer) {
        this.event_participer = event_participer;
    }

    public int getEvent_done() {
        return event_done;
    }

    public void setEvent_done(int event_done) {
        this.event_done = event_done;
    }

    public int getUser_basic_id() {
        return user_basic_id;
    }

    public void setUser_basic_id(int user_basic_id) {
        this.user_basic_id = user_basic_id;
    }
}
