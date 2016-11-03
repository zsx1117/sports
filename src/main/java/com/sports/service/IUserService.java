package com.sports.service;

import com.sports.model.UserVO;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by Gundam on 2016/10/25.
 */
public interface IUserService {
    boolean isExist(String loginName);

    UserVO findUserByPwd(java.lang.String loginName, java.lang.String password);

    UserVO findUserByAccount(String loginName);

    void updateToken(UserVO user);

    boolean register(UserVO user);

    UserVO findUserById(int Id);
}
