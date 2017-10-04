package com.sports.service.impl;

import com.sports.Dao.UserDao;
import com.sports.model.FriendRequestVO;
import com.sports.model.UserVO;
import com.sports.pojo.FriendRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sports.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gundam on 2016/10/25.
 */
@Service("userService")
public class UserServiceImpl implements com.sports.service.IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean isExist(String loginName) {
        return userDao.checkUserExisted(loginName) > 0;
    }

    @Override
    public UserVO findUserByPwd(java.lang.String loginName, java.lang.String password) {
        User user = userDao.getUserByPwd(loginName, password);
        return assembleUserVO(user);
    }

    @Override
    public UserVO findUserByAccount(String loginName) {
        return null;
    }

    @Override
    public void updateToken(UserVO user) {
    }


    @Override
    public boolean register(UserVO userVO) {
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        int count = userDao.addUser(user);
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public UserVO findUserById(int Id) {
        User user = userDao.getUserById(Id);
        return assembleUserVO(user);
    }

    /**
     * 修改用户喜好的运动
     *
     * @param likes
     * @return
     */
    @Override
    public boolean setUserLikes(String[] likes) {
        return true;
    }

    /**
     * 获取好友请求
     *
     * @param user_id
     * @param page_size    一页多少条目
     * @param current_page 现在第几页
     * @return
     */
    @Override
    public List<FriendRequestVO> getFriendRequests(String user_id, String page_size, String current_page) {
        int pageSize = Integer.valueOf(page_size);
        List<FriendRequestVO> list = new ArrayList<>();
        for (int i = 0; i < pageSize; i++) {
            FriendRequestVO item = new FriendRequestVO();
            item.setUser_id(i);
            item.setUser_name("robot" + i);
            item.setRequest_content("add me!!!!!!!");
            item.setRequest_create_time("2016-11-11 11:11:11");
            list.add(item);
        }
        return null;
    }

    /**
     * 返回总共有多少条好友请求，用于分页
     *
     * @param user_id
     * @return
     */
    @Override
    public int getFriendRequestsCount(String user_id) {
        return 35;
    }

    /**
     * 创建新的好友请求
     *
     * @param requestVO
     * @return
     */
    @Override
    public boolean createFriendRequests(FriendRequestVO requestVO) {
        if (requestVO != null) {
            FriendRequest friendRequest = new FriendRequest();
            BeanUtils.copyProperties(requestVO, friendRequest);
            return userDao.createFriendRequest(friendRequest);
        }
        return false;
    }

    /**
     * Use for assembling and get the UserVO
     *
     * @param user
     * @return UserVO
     */
    public UserVO assembleUserVO(User user) {
        if (user != null) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            return userVO;
        } else {
            return null;
        }
    }
}
