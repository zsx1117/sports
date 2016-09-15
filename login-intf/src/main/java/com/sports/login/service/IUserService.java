package com.sports.login.service;

import com.sports.login.vo.UserVO;

/**
 * Created by Gundam on 2016/9/15.
 */
public interface IUserService {
    boolean isExist(String loginName);

    UserVO addUser(String loginName, String password);

    UserVO findUserByAccount(String loginName);

    void updateToken(UserVO user);
}
