package com.sports.model;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
public class CreateSportEvent {

    private String event_sport;
    private String event_location;
    private int event_participer_number;
    private String event_description;
    private String event_sport_type;
    private int user_basic_id;

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

    public int getUser_basic_id() {
        return user_basic_id;
    }

    public void setUser_basic_id(int user_basic_id) {
        this.user_basic_id = user_basic_id;
    }
}
