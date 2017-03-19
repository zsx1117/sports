package com.sports.service;

import com.sports.model.NewsVO;

import java.util.List;

/**
 * Created by Wentong WANG on 2016/11/20.
 */
public interface INewsService {
    List<NewsVO> getNews(String user_id,String user_like,String page_size,String current_page);

    int getNewsCount(String user_id);
}
