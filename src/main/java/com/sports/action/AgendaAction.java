package com.sports.action;

import com.sports.service.IAgendaService;
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
 * Created by qifan on 2016/12/1.
 */
@Controller
@RequestMapping("/agenda")
public class AgendaAction extends BaseController {
    @Autowired
    @Qualifier("AgendaService")
    private IAgendaService agendaService;

    public void setAgendaService(IAgendaService agendaService){
        this.agendaService=agendaService;
    }
    @RequestMapping(value = "/getagenda", method = RequestMethod.POST)
    public
    @ResponseBody
    String getArticles(@RequestParam String user_id, String user_event_time, String page_size, String current_page){
        Map<String, String> result = new HashMap<>();
        result.put("result", GsonUtils.getInstance().toJson(agendaService.getAgenda(user_id, user_event_time,page_size,current_page)));
        return CollectionUtils.getOutCome(SUCCESS, LOGINSUCCESSMESSAGE, result);
    }

}
