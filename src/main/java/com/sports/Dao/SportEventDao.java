package com.sports.Dao;

import com.sports.pojo.SportEvent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wentong WANG on 2017/4/1.
 */
@Repository
public interface SportEventDao {
    public int createSportEvent(SportEvent sportEvent);

    List<SportEvent> getSportEventsByType(String type);
}
