package com.sports.service;

import com.sports.model.HomeVO;

import java.util.List;

/**
 * Created by qifan on 2016/12/13.
 */
public interface IHomeService {
    List<HomeVO> getHomeSportEvent(String user_id, String user_like);
}
