package com.sports.action;

import com.sports.model.CreateSportEvent;
import com.sports.service.ISportEventService;
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

/**
 * Created by Wentong WANG on 2017/4/1.
 */
@Controller
@RequestMapping("/sport/events")
public class SportEventsAction extends BaseController {

    @Autowired
    @Qualifier("sportsEventService")
    ISportEventService sportEventService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public
    @ResponseBody
    String createSportEvent(@RequestParam String user_id, String eventJson ) {

        CreateSportEvent createSportEvent = GsonUtils.getInstance().fromJson(eventJson, CreateSportEvent.class);
        createSportEvent.setUser_basic_id(Integer.valueOf(user_id));

        if (sportEventService.createSportEvent(createSportEvent)) {
            return CollectionUtils.getOutCome(SUCCESS, OPERATIONSUCCESSMESSAGE, EMPTYRESULT);
        } else {
            return CollectionUtils.getOutCome(FAILED, OPERATIONFAILEDMESSAGE, EMPTYRESULT);
        }


    }
}
