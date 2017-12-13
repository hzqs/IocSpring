package edu.nf.controller;

import edu.nf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by hzq on 2017/12/13.
 * 在控制层可以使用@Controller注解来替代@Component,表示这是一个web控制器
 */
@Controller("controller")
@Scope("prototype")
public class UserController {

    /*当有多个相同名称的注解时，resource注解只能在字段，和set方法上，不能通过构造方法注入
    * */
    @Autowired()
    @Qualifier("userService")
    private UserService userService;

    public void addUser(){
        userService.addUser();

    }

    @PostConstruct  //初始化
    public void init(){
        System.out.print("userController被初始化了");
    }
    @PreDestroy      //销毁
    public void destroy(){
        System.out.print("准备销毁");
    }



    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
