package com.superb;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.superb.model.UserEntity;
import com.superb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = StartApplication.class)
@RunWith(SpringRunner.class)
public class TestMybatis {
    @Autowired
    UserService userService;
    @Test
    public void aTest(){
        List<UserEntity> userBySex = userService.getUserBySex(1);

        System.out.println(userBySex);
    }

    @Test
    public void addTest(){
        for(int i=0;i<100;i++){
            UserEntity user = new UserEntity();
            user.setUserAddress("测试地址"+i);
            user.setUserName("高超"+i);
            user.setUserSex(i/2==0 ? 1 : 0);
            userService.save(user);
        }
    }

    @Test
    public void selectPageTest(){
        UserEntity user = new UserEntity();
        user.setUserSex(0);
        IPage<UserEntity> userEntityIPage = userService.selectByPage(user);

        System.out.println("data:"+ JSONObject.toJSONString(userEntityIPage));


    }
}
