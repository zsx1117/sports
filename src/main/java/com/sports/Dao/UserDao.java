package com.sports.Dao;

import com.sports.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Gundam on 2016/10/26.
 */
public interface UserDao {
    public User getUserById (int id);
}
