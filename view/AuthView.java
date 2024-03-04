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
            System.out.println("[메뉴]\n 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n " +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n " +
                    "8-직업검색\n " +
                    "9-회원수\n " );
            switch (sc.next()){
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("=== 회원가입 ===");
                    msg = ctrl.join(sc);
                case "2":
                    System.out.println("=== 로그인 ===");
                    msg = ctrl.login(sc);
                    break;
                case "3":
                    System.out.println("=== ID검색 ===");
                    Map<String, User> users = ctrl.getUserMap();
                    users.forEach((k,v)->
                            System.out.print("{"+k+","+v+"},"));
                    ctrl.findUser(sc.next());
                    break;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    ctrl.getUserMap();
                    break;
                case "9":
                    System.out.println("=== 회원수 ===");
                     ctrl.count();
                    return;

            }

        }

    }
}