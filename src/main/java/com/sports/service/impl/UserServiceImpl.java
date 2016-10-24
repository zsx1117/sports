package com.sports.service.impl;

import com.sports.model.UserVO;
import org.springframework.stereotype.Service;

/**
 * Created by Gundam on 2016/10/25.
 */
@Service("userService")
public class UserServiceImpl implements com.sports.service.IUserService{
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
    @Override
    public boolean register(UserVO user){
        return true;
    }
}
