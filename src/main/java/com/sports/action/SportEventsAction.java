package com.sports.action;

import com.sports.utils.BaseController;
import com.sports.utils.CollectionUtils;
import com.sports.utils.GsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
@Controller
@RequestMapping("/sport/events")
public class SportEventsAction extends BaseController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public
    @ResponseBody
    String createSportEvent(@RequestParam String user_id, String eventJson ) {





        return CollectionUtils.getOutCome(SUCCESS, OPERATIONSUCCESSMESSAGE, null);
    }
}
