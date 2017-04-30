package com.sports.service;

import com.sports.model.CreateSportEvent;
import com.sports.model.SportsFirstClass;

import java.util.List;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
public interface ISportEventService {
    boolean createSportEvent(CreateSportEvent createSportEvent);

    List<SportsFirstClass> getSportEventsByType(String type);
}
