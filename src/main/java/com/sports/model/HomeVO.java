package com.sports.model;

import java.util.List;

/**
 * Created by qifan on 2016/12/2.
 */
public class HomeVO {
    private String type;
    private List<SportsSecondClass> sports;
    private String imageUrl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SportsSecondClass> getSports() {
        return sports;
    }

    public void setSports(List<SportsSecondClass> sports) {
        this.sports = sports;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
