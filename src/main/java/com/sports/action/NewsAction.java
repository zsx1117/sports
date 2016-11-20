package com.sports.action;

import com.sports.model.UserVO;
import com.sports.service.INewsService;
import com.sports.utils.BaseController;
import com.sports.utils.CollectionUtils;
import com.sports.utils.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wentong WANG on 2016/11/20.
 */
@Controller
@RequestMapping("/articles")
public class NewsAction extends BaseController {

    @Autowired
    @Qualifier("newsService")
    private INewsService newsService;

    public void setNewsService(INewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping(value = "/getarticles", method = RequestMethod.POST)
    public
    @ResponseBody
    String getArticles(@RequestParam String user_id, String user_like, String page_size, String current_page) {

        Map<String, String> result = new HashMap<>();
        result.put("result", GsonUtils.getInstance().toJson(newsService.getNews(user_id, user_like, page_size, current_page)));
        return CollectionUtils.getOutCome(SUCCESS, LOGINSUCCESSMESSAGE, result);


    }
}
