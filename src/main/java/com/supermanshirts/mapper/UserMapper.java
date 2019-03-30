package com.supermanshirts.mapper;

import com.supermanshirts.entity.UserEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {


    @Select("SELECT * FROM users WHERE id = #{id}")
    UserEntity getUser(int id);

    @Select("SELECT * FROM tb_minfo WHERE user_name = #{username}")
    UserEntity getUserByName(String username);

    @Insert("INSERT INTO tb_minfo(shirt_id,record_id,user_name,user_pass,user_himg,nick_name,m_shape,m_abdomen,m_shoulder" +
            ") VALUES(#{shirt_id},#{record_id},#{user_name}, #{user_pass},#{user_himg},#{nick_name},#{m_shape},#{m_abdomen},#{m_shoulder})")
    @Options(useGeneratedKeys = true,keyColumn = "id")
    void insert(UserEntity user);
}
