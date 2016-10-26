package com.sports.service.impl;

import com.sports.Dao.UserDao;
import com.sports.model.UserVO;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sports.pojo.User;

/**
 * Created by Gundam on 2016/10/25.
 */
@Service("userService")
public class UserServiceImpl implements com.sports.service.IUserService{

    @Autowired
    private UserDao userDao;

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

    @Override
    public UserVO findUserById(int Id){
        UserVO userVO = new UserVO();
        User user = userDao.getUserById(1);
        BeanUtils.copyProperties(user,userVO);
        return userVO;
    }
}
