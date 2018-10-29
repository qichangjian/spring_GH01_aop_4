package com.qcj.service.impl;

import com.qcj.service.UserService;
//目标代码类
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete");
    }
}
