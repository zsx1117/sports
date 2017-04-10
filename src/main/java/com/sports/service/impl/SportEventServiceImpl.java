package com.sports.service.impl;

import com.sports.Dao.SportEventDao;
import com.sports.model.CreateSportEvent;
import com.sports.pojo.SportEvent;
import com.sports.service.ISportEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
@Service("sportsEventService")
public class SportEventServiceImpl implements ISportEventService {

    @Autowired
    SportEventDao sportEventDao;

    @Override
    public boolean createSportEvent(CreateSportEvent createSportEvent) {
        SportEvent sportEvent = new SportEvent();
        sportEvent.setEvent_sport(createSportEvent.getEvent_sport());
        sportEvent.setEvent_sport_type(createSportEvent.getEvent_sport_type());
        sportEvent.setEvent_description(createSportEvent.getEvent_description());
        sportEvent.setEvent_participer_number(createSportEvent.getEvent_participer_number());
        sportEvent.setEvent_location(createSportEvent.getEvent_location());
        sportEvent.setEvent_start_time(createSportEvent.getEvent_start_time());
        sportEvent.setUser_basic_id(createSportEvent.getUser_basic_id());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//2016-11-10 12:00:00
        sportEvent.setEvent_create_time(df.format(new Date()));// new Date()为获取当前系统时间

        return sportEventDao.createSportEvent(sportEvent) == 1;
    }
}
