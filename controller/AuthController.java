package controller;

import builder.UserBuilder;
import model.UserDTO;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class AuthController {

    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }


    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");


        return auth.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build())
                ;
    }

    public String login(Scanner sc) {
        return auth.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String addUsers() {
        return auth.addUsers();
    }

    public void findUser(String username) {
        auth.findUser(username);
    }

    public Map<String, UserDTO> getUserMap() {
        return auth.getUserMap();
    }

    public String count() {
        System.out.println("회원수 : "+auth.count()+"명");;
        return auth.count();
    }
}
