package com.sports.login.action;

import action.BaseController;
import com.sports.login.service.IUserService;
import com.sports.login.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.CollectionUtils;
import utils.GsonUtils;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class LoginAction extends BaseController {

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value="/login",method= RequestMethod.POST)
    public
    @ResponseBody
    String login(@RequestParam String loginName,String password){
        if(loginName != null && loginName.equals("admin") && password != null && password.equals("123456") ){
            return CollectionUtils.getOutCome(SUCCESS,LOGINSUCCESSMESSAGE,EMPTYRESULT);
        }else{
            return CollectionUtils.getOutCome(FAILED,LOGINFAILEDMESSAGE,EMPTYRESULT);
        }
    }

    @RequestMapping(value="/register",method= RequestMethod.POST)
    public
    @ResponseBody
    String register(@RequestParam String userJson){
        UserVO userVO= GsonUtils.getInstance().fromJson(userJson,UserVO.class);
        if(userService.register(userVO)){
            return CollectionUtils.getOutCome(SUCCESS,OPERATIONSUCCESSMESSAGE,EMPTYRESULT);
        }
        else return CollectionUtils.getOutCome(SUCCESS,OPERATIONFAILEDMESSAGE,EMPTYRESULT);
    }

    @RequestMapping(value="/test")
    public
    @ResponseBody
    String test() {
        String result = CollectionUtils.getOutCome(SUCCESS,LOGINSUCCESSMESSAGE,EMPTYRESULT);
        return result;
    }
}
