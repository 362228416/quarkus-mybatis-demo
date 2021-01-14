package com.cs.dao;

import com.cs.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") int id);

    @Insert("insert into user(username,password) values(#{em.username},#{em.password})")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    int insert(@Param("em") User user);

}
