package com.sports.service.impl;

import com.sports.model.NewsVO;
import com.sports.service.INewsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wentong WANG on 2016/11/20.
 */
@Service("newsService")
public class NewsServiceImpl implements INewsService{


    @Override
    public List<NewsVO> getNews(String user_id, String user_like, String page_size, String current_page) {
        int pageSize = Integer.valueOf(page_size);
        List<NewsVO> list = new ArrayList<>();
        for (int i = 0;i< pageSize;i++) {
            NewsVO item = new NewsVO();
            item.setNews_title("play toghter");
            item.setNews_create_time("2016-11-11 11:11:11");
            item.setNews_place("UTT");
            item.setNews_likes_total(String.valueOf(i*50));
            item.setNews_liked(String.valueOf(0));
            item.setNews_view(String.valueOf((i+1)*50-30));
            item.setNews_content("balabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabala");
            list.add(item);
        }


        return list;
    }
}
