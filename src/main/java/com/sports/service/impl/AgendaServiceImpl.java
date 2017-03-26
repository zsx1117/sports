package com.sports.service.impl;

import com.sports.model.AgendaVO;
import com.sports.service.IAgendaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qifan on 2016/12/1.
 */
@Service("AgendaService")
public class AgendaServiceImpl implements IAgendaService {


    @Override
    public List<AgendaVO> getAgenda(String user_id, String user_event_time,String page_size,String current_page) {
        List<AgendaVO> list=new ArrayList<>();
        int pageSize = Integer.valueOf(page_size);
        for (int i=0;i<pageSize;i++){
            AgendaVO item=new AgendaVO();
            item.setUser_name("Username");
            item.setUser_events_time("12:00");
            item.setUser_events_place("UTT");
            item.setUser_events_name("basketball");
            item.setEvents_Progress(String.valueOf(i*10));
            list.add(item);
        }
        return list;
    }


}
