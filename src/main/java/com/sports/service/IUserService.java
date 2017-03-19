package com.sports.service;

import com.sports.model.FriendRequestVO;
import com.sports.model.UserVO;

import java.util.List;

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

    boolean setUserLikes(String[] likes);

    List<FriendRequestVO> getFriendRequests(String user_id, String page_size, String current_page);

    int getFriendRequestsCount(String user_id);

    boolean createFriendRequests(FriendRequestVO requestVO);
}
