package com.sports.service.impl;

import com.sports.Dao.UserDao;
import com.sports.model.UserVO;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
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
    public  UserVO findUserByPwd(java.lang.String loginName, java.lang.String password){
        User user = userDao.getUserByPwd(loginName, password);
        return assembleUserVO(user);
    }

    @Override
    public UserVO findUserByAccount(String loginName){
        return null;
    }
    @Override
    public void updateToken(UserVO user){
    }


    @Override
    public boolean register(UserVO userVO){
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        int count=userDao.addUser(user);
        if (count==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public UserVO findUserById(int Id){
        User user = userDao.getUserById(Id);
        return assembleUserVO(user);
    }

    /**Use for assembling and get the UserVO
     *
     * @param user
     * @return UserVO
     */
    public UserVO assembleUserVO (User user){
        if (user != null) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            return userVO;
        }else{
            return null;
        }
    }
}
