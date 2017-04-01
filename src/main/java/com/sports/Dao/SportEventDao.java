package com.sports.Dao;

import com.sports.pojo.SportEvent;
import org.springframework.stereotype.Repository;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
@Repository
public interface SportEventDao {
    public boolean createSportEvent(SportEvent sportEvent);
}
