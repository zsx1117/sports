package com.sports.service.impl;

import com.sports.model.AgendaVO;
import com.sports.model.HomeVO;
import com.sports.model.SportsSecondClass;
import com.sports.service.IHomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qifan on 2016/12/2.
 */
@Service("HomeService")
public class HomeServiceImpl implements IHomeService{

    @Override
    public List<HomeVO> getHomeSportEvent(String user_id, String user_like) {
        List<HomeVO> list=new ArrayList<>();
        List<SportsSecondClass> sportsSecondClassList=new ArrayList<>();
        List<String> event_participates_id =new ArrayList<>();
        event_participates_id.add("1");
        SportsSecondClass itemSecond=new SportsSecondClass();
        itemSecond.setEvent_creat_time("2016-12-13");
        itemSecond.setEvent_start_time("12:00");
        itemSecond.setEvent_end_time("14:00");
        itemSecond.setEvent_creator_name("undervoidfall");
        itemSecond.setEvent_creator_head_url("");
        itemSecond.setEvent_number("1");
        itemSecond.setEvent_place("UTT Troyes");
        itemSecond.setEvent_participates_id(event_participates_id);
        sportsSecondClassList.add(itemSecond);
        int number_event=Integer.valueOf(itemSecond.getEvent_number());
        for (int i=0;i<number_event;i++){
            HomeVO item=new HomeVO();
            item.setType("Football");
            item.setImageUrl("");
            item.setSports(sportsSecondClassList);
            list.add(item);
        }
        return list;
    }
}
