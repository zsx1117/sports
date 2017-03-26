package com.sports.action;

import com.sports.service.IHomeService;
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
 * Created by qifan on 2016/12/2.
 */
@Controller
@RequestMapping("/home")
public class HomeAction extends BaseController{
    @Autowired
    @Qualifier("HomeService")
    private IHomeService homeService;
    private void setHomeService(IHomeService homeService){this.homeService=homeService;}
    @RequestMapping(value = "/gethomesportevent", method = RequestMethod.POST)
    public
    @ResponseBody
    String getHomeSportEvent(@RequestParam String user_id, String user_like){
        Map<String, String> result = new HashMap<>();
        result.put("result", GsonUtils.getInstance().toJson(homeService.getHomeSportEvent(user_id,user_like)));
        return CollectionUtils.getOutCome(SUCCESS, LOGINSUCCESSMESSAGE, result);
    }
}
