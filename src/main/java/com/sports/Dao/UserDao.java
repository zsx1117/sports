package com.sports.Dao;

import com.sports.pojo.FriendRequest;
import com.sports.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Gundam on 2016/10/26.
 */
@Repository
public interface UserDao {
    public User getUserById (int id);

    public User getUserByPwd (@Param("userName")String userName,@Param("userPassword")String userPassword );

    public int checkUserExisted(@Param("userName")String userName);

    public int addUser(User user);

    public boolean createFriendRequest(FriendRequest friendRequest);
}
