package view;

import controller.AuthController;
import model.User;

import java.util.Map;
import java.util.Scanner;

public class AuthView {
    public static void main( Scanner sc) {
        AuthController ctrl = new AuthController();
        String msg = ctrl.addUsers();

        while(true){
            System.out.println("[관리자메뉴] 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n" +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("1-회원가입");
                    msg = ctrl.join(sc);
                    System.out.println("회원가입 결과 : "+msg);
                    break;
                case "2":
                    System.out.println("2-로그인");
                    msg = ctrl.login(sc);
                    System.out.println("로그인 결과 : "+msg);
                    break;
                case "3":
                    System.out.println("3-ID 검색");
                    System.out.println(ctrl.findUserById(sc));
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    System.out.println(ctrl.findUserById(sc));
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    System.out.println(ctrl.deleteUser(sc));
                    break;
                case "6":
                    System.out.println("6-회원목록");
                    Map<String, ?> users = ctrl.getUserMap();
                    users.forEach((k,v)->{
                        System.out.printf("아이디: %s, 회원정보: %s", k, v);
                    });
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    ctrl.findUsersByName(sc).forEach((i)->{
                        System.out.println(i);
                    });
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    ctrl.findUsersByJob(sc).forEach((i)->{
                        System.out.println(i);
                    });
                    break;
                case "9":
                    System.out.println("9-회원수");
                    String numberOfUsers = ctrl.countUsers();
                    System.out.println("회원수 "+numberOfUsers);
                    break;


            }

        }

    }
}