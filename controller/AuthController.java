package controller;

import model.User;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthController {

    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }


    public String addUsers() {
        return auth.addUsers();
    }

    public String join(Scanner scanner) {
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주민번호 " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return auth.join(User.builder()
                .username(scanner.next())
                .password(scanner.next())
                .name(scanner.next())
                .address(scanner.next())
                .job(scanner.next())
                .build());
    }

    public String login(Scanner scanner) {
        System.out.println("로그인할 ID 입력 : ");
        return auth.login(User.builder()
                .username(scanner.next())
                .password(scanner.next())
                .build());
    }

    public User findUserById(Scanner scanner) {
        System.out.println("검색할 ID 입력 : ");

        return auth.findUserById(scanner.next());
    }

    public String updatePassword(Scanner scanner) {
        System.out.println("수정할 ID 입력 : ");
        System.out.println("수정할 비번 입력 : ");
        return auth.updatePassword( User.builder()
                .username(scanner.next())
                .password(scanner.next())
                .build());
    }

    public String deleteUser(Scanner scanner) {
        System.out.println("삭제할 ID 입력 : ");
        return auth.deleteUser(scanner.next());
    }

    public Map<String, ?> getUserMap() {
        System.out.println("전체 목록 출력");
        return auth.getUserMap();
    }



    public List<?> findUsersByName(Scanner scanner) {
        System.out.println("이름으로 검색");
        return auth.findUsersByName(scanner.next());
    }

    public List<?> findUsersByJob(Scanner scanner) {
        System.out.println("직업으로 검색");
        return auth.findUsersByJob(scanner.next());
    }

    public String countUsers() {
        System.out.println("회원수");
        return auth.countUsers();
    }
}
