package controller;


import model.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserService us;

    public UserController() {
        this.us = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        String msg = us.addUsers();
        return msg;
    }

    public String count() {
        return null;

    }

    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");


        return us.join(User.builder()
                .username(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build())
                ;
    }

    public Map<String, User> getUserMap() {
        return us.getUserMap();
    }

    public String login(Scanner sc) {
        return us.login(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String idSearch(Scanner sc) {
        return us.idSearch(User.builder()
                .username(sc.next())
                .build());
    }

    public User jobSearch(Scanner sc) {
        return us.jobSearch(User.builder()
                .job(sc.next())
                .build());
    }
}