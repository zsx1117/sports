package com.sports.test;

import com.sports.model.CreateSportEvent;
import com.sports.model.SportsFirstClass;
import com.sports.service.ISportEventService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-mybatis.xml" })
public class TestSportEvent {

    private static final Logger LOGGER = Logger.getLogger(TestSportEvent.class);

    @Autowired
    private ISportEventService sportEventService;

    // private IAgendaService agendaService;
    @Test
    public void testCreateNewSportEvent() {

        CreateSportEvent sportEvent = new CreateSportEvent();
        sportEvent.setEvent_sport("一起打篮球");
        sportEvent.setEvent_sport_type("001");
        sportEvent.setEvent_description("大家一起来打篮球啊！！！！！");
        sportEvent.setEvent_participer_number(10);
        sportEvent.setEvent_location("Troyes");
        sportEvent.setEvent_start_time("2017-5-1 12:00:00");
        sportEvent.setUser_basic_id(1);

        if (sportEventService.createSportEvent(sportEvent)) {
            LOGGER.info("success");
        } else {
            LOGGER.info("false");
        }

    }

    @Test
    public void testGetSportEventsByType() {
        String types = "001";

        List<SportsFirstClass> secondClassList = sportEventService.getSportEventsByType(types);
        System.out.print(secondClassList.toString());
    }
}
