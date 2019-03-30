package com.supermanshirts.controller;

import com.supermanshirts.entity.ResponseEntity;
import com.supermanshirts.entity.UserEntity;
import com.supermanshirts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseEntity get(String username,String userpass){
        ResponseEntity responseEntity=new ResponseEntity();
        UserEntity userEntity=userService.getUser(username,userpass);
        if(userEntity.getUser_pass().equals(userpass)){
            responseEntity.setStatus(200);
            responseEntity.setMsg("登录成功");
            responseEntity.setData(userEntity);
        }else {
            responseEntity.setStatus(300);
            responseEntity.setMsg("登录失败");
        }
        return responseEntity;
    }

    /*注册用户*/
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResponseEntity register(String username,String userpass){
        ResponseEntity responseEntity=new ResponseEntity(200,"注册失败","");
       try{
           String nickName="superman"+System.currentTimeMillis();
           UserEntity userEntity=new UserEntity(0,0,username,userpass,"https://ss0.bdstatic.com/-0U0b8Sm1A5BphGlnYG/kmarketingadslogo/49b8e752ae9dbb3a5ed375f1185d7683_250_250.jpg",nickName,"标准体","扁腹","耸肩");
           userService.insertUser(userEntity);
           responseEntity.setStatus(200);
           responseEntity.setMsg("注册成功");
           return responseEntity;
       }catch (Exception e){
           return responseEntity;
       }

    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        System.out.println("");
        return "测试";
    }
}
