package cn.wddxhz.mapper;

import cn.wddxhz.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int addUser(User user);

    List<User> selectAll();
}
