package com.sports.login.service.impl;
import com.sports.login.vo.UserVO;
import org.springframework.stereotype.Service;


/**
 * Created by Gundam on 2016/9/15.
 */
@Service("userService")
public class UserServiceImpl implements com.sports.login.service.IUserService {
    @Override
    public boolean isExist(String loginName){
        return false;
    }

    @Override
    public  UserVO addUser(String loginName, String password){
        return null;
    }

    @Override
    public UserVO findUserByAccount(String loginName){
        return null;
    }
    @Override
    public void updateToken(UserVO user){
    }

}
