package com.sports.test;
import com.sports.model.FriendRequestVO;
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
   // private IAgendaService agendaService;
    @Test
    public void testQueryByNameAndPassword(){
        UserVO userInfo = userService.findUserByPwd("admin","12345");
        if(userInfo !=null ) {
            LOGGER.info(userInfo.toString());
        }
    }

    @Test
    public void testQueryInsert(){
        UserVO userInfo = new UserVO();
        userInfo.setUser_name("adminZhang");
        userInfo.setUser_password("12345");
        userInfo.setUser_authority(200);
        Boolean flag=userService.register(userInfo);
        if(flag){
            LOGGER.info(userInfo.toString());
        }else{
            LOGGER.info("failed");
        }
    }

    @Test
    public void testQueryById1() {
        UserVO userInfo = userService.findUserById(1);
        if(userInfo !=null ) {
            LOGGER.info(userInfo.toString());
        }
    }

    @Test
    public void testQueryInsertFriendRequest(){
        FriendRequestVO requestVO = new FriendRequestVO();
        requestVO.setUser_id(1);
        requestVO.setUser_friend_id(2);
        requestVO.setRequest_content("add me!!!!");
        requestVO.setRequest_create_time("2016-11-24 11:11:11");
        if (userService.createFriendRequests(requestVO)) {
            LOGGER.info("successed");
        } else {
            LOGGER.info("failed");
        }
    }
}
