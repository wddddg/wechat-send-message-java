package cn.wddxhz;

import cn.wddxhz.mapper.UserMapper;
import cn.wddxhz.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WechatSendMessageApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testGetAll(){
        List<User> list = userMapper.selectAll();
        System.out.println(list);
        return;
    }

}
