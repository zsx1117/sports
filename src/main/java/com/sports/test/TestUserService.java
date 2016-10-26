package com.sports.test;
import com.sports.model.UserVO;
import com.sports.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by Gundam on 2016/10/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-mybatis.xml" })
public class TestUserService {
   private static final Logger LOGGER =Logger.getLogger(TestUserService.class);

    @Autowired
    private IUserService userService;

    @Test
    public void testQueryById1() {
        UserVO userInfo = userService.findUserById(1);
        LOGGER.info(userInfo.toString());
    }
}
