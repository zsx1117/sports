package com.sports.service;

import com.sports.model.AgendaVO;
import com.sports.model.UserVO;

import java.util.List;

/**
 * Created by qifan on 2016/12/1.
 */
public interface IAgendaService {
    List<AgendaVO> getAgenda(String user_id, String user_event_time, String page_size, String current_page);
    //AgendaVO findAgendayId(int Id);
}
