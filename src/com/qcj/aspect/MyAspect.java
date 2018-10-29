package com.qcj.aspect;

//增强代码类
public class MyAspect {

     public void before(){
         System.out.println("开始事务");
     }

    public void after(){
        System.out.println("提交事务");
    }
}
