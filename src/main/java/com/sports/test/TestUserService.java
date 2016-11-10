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
    public void testQueryByNameAndPassword(){
        UserVO userInfo = userService.findUserByPwd("admin","12345");
        if(userInfo !=null ) {
            LOGGER.info(userInfo.toString());
        }
    }

//    @Test
//    public void testQueryInsert(){
//        UserVO userInfo = new UserVO();
//        userInfo.setName("ZHANG");
//        userInfo.setPassword("123");
//        userInfo.setSex(1);
//        Boolean flag=userService.register(userInfo);
//        if(flag){
//            LOGGER.info(userInfo.toString());
//        }else{
//            LOGGER.info("failed");
//        }
//    }

    @Test
    public void testQueryById1() {
        UserVO userInfo = userService.findUserById(1);
        if(userInfo !=null ) {
            LOGGER.info(userInfo.toString());
        }
    }
}
