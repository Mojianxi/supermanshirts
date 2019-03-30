package com.supermanshirts.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {
    /*用户id*/
   private int m_id;
   /*衬衫id*/
   private int shirt_id;
   /*定制订单id*/
   private int record_id;
   /*用户名*/
   private String user_name;
   /*用户密码*/
   private String user_pass;
   /*用户头像*/
   private String user_himg;
   /*用户昵称*/
   private String nick_name;
   /*用户体型*/
   private String m_shape;
   /*用户腹部描述*/
   private String m_abdomen;
   /*用户肩部描述*/
   private String m_shoulder;

    public int getM_id() {
        return m_id;
    }

    public int getShirt_id() {
        return shirt_id;
    }

    public int getRecord_id() {
        return record_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public String getUser_himg() {
        return user_himg;
    }

    public String getNick_name() {
        return nick_name;
    }

    public String getM_shape() {
        return m_shape;
    }

    public String getM_abdomen() {
        return m_abdomen;
    }

    public String getM_shoulder() {
        return m_shoulder;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public void setShirt_id(int shirt_id) {
        this.shirt_id = shirt_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public void setUser_himg(String user_himg) {
        this.user_himg = user_himg;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public void setM_shape(String m_shape) {
        this.m_shape = m_shape;
    }

    public void setM_abdomen(String m_abdomen) {
        this.m_abdomen = m_abdomen;
    }

    public void setM_shoulder(String m_shoulder) {
        this.m_shoulder = m_shoulder;
    }

    public UserEntity() {
    }

    public UserEntity(int shirt_id, int record_id, String user_name, String user_pass, String user_himg, String nick_name, String m_shape, String m_abdomen, String m_shoulder) {
        this.shirt_id = shirt_id;
        this.record_id = record_id;
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.user_himg = user_himg;
        this.nick_name = nick_name;
        this.m_shape = m_shape;
        this.m_abdomen = m_abdomen;
        this.m_shoulder = m_shoulder;
    }
}
