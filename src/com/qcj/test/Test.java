package com.qcj.test;

import com.qcj.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  aop切面编程讲解
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/qcj/config/applicationContext.xml");
        //从容器中获取对象
        UserService userService = context.getBean("userService",UserService.class);
        userService.addUser(); //这个方法做了切面编程
        userService.deleteUser();
    }
}
