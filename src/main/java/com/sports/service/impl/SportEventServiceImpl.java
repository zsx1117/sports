package com.sports.service.impl;

import com.sports.Dao.SportEventDao;
import com.sports.Dao.UserDao;
import com.sports.model.CreateSportEvent;
import com.sports.model.SportsFirstClass;
import com.sports.model.SportsSecondClass;
import com.sports.pojo.SportEvent;
import com.sports.pojo.User;
import com.sports.service.ISportEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
@Service("sportsEventService")
public class SportEventServiceImpl implements ISportEventService {

    @Autowired
    SportEventDao sportEventDao;

    @Autowired
    UserDao userDao;

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


    @Override
    public List<SportsFirstClass> getSportEventsByType(String types) {
        List<SportsFirstClass> result = new ArrayList<>();

        String[] myTypes = types.split(",");
        List<String> sportEventTypes = Arrays.asList(myTypes);

        for (String type : sportEventTypes) {
            List<SportsSecondClass> sports = getEventsByTypeFromDao(type);
            if (sports != null) {
                SportsFirstClass homeSport = new SportsFirstClass();
                homeSport.setType(type);
                homeSport.setSports(sports);

                result.add(homeSport);
            }
        }

        return result;
    }


    private List<SportsSecondClass> getEventsByTypeFromDao(String type) {
        List<SportEvent> sportEventDaoList = sportEventDao.getSportEventsByType(type);
        List<SportsSecondClass> results = new ArrayList<>();

        for (SportEvent event : sportEventDaoList) {
            SportsSecondClass secondClass = new SportsSecondClass();

            User user = userDao.getUserById(event.getUser_basic_id());

            secondClass.setEvent_creat_time(event.getEvent_create_time());
            secondClass.setEvent_start_time(event.getEvent_start_time());
            secondClass.setEvent_end_time(event.getEvent_end_time());
            secondClass.setEvent_place(event.getEvent_location());
            secondClass.setEvent_participates_id(getParticipators(event.getEvent_participer()));
            secondClass.setEvent_creator_name(user.getUser_name());
            secondClass.setEvent_creator_head_url(user.getUser_imageURL());
            secondClass.setEvent_number(String.valueOf(event.getEvent_participer_number()));

            results.add(secondClass);
        }
        return results;
    }


    private List<String> getParticipators(String participators) {
        List<String> result = new ArrayList<>();
        if (participators == null) {
            return result;
        }

        if (participators.isEmpty()) {
            return result;
        }

        String[] myTypes = participators.split(",");
        result = Arrays.asList(myTypes);
        return result;
    }
}
