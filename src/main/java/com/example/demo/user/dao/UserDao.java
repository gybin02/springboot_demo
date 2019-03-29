package com.example.demo.user.dao;


import com.example.demo.user.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Insert("insert into t_user(id,name, age) values (#{id},#{name},#{age})")
    void addUser(User user);

    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);

    @Select("SELECT id,name,age FROM t_user where id = #{id}")
    User findUser(int id);

    @Select("select * from t_user limit 10")
    List<User> findAll();

}
