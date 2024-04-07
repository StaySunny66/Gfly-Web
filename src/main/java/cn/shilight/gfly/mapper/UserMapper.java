package cn.shilight.gfly.mapper;

import cn.shilight.gfly.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface  UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAllUsers();

    @Select("SELECT * FROM user WHERE userid = #{userid}")
    User getUserById(String userid);

    @Select("SELECT * FROM user WHERE username = #{username}")
    User getUserByUserName(String username);

    @Insert("INSERT INTO user (userid, username, password) VALUES (#{userid},#{username},#{password})")
    int insertUser(User user);



    @Update("UPDATE user SET passwprd = #{password}, username= #{username}, nickname = #{nickname} WHERE userid = #{userid}")
    int updateUser(User user);

    @Delete("DELETE FROM user WHERE id = #{userid}")
    int deleteUser(String userid);
}
