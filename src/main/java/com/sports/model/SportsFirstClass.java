package com.sports.model;

import java.util.List;

/**
 * Created by Wentong WANG on 2017/4/30.
 */
public class SportsFirstClass {
    private String type;
    private List<SportsSecondClass> sports;
    private String imageUrl;


    public void setType(String type) {
        this.type = type;
    }


    public void setSports(List<SportsSecondClass> sports) {
        this.sports = sports;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
