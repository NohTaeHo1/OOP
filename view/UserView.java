package view;

import controller.UserController;
import model.UserDTO;

import java.util.Map;
import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController uc = new UserController();
        String msg = uc.addUsers();
        //System.out.println("adduser 수 : "+msg);

        while (true) {
            System.out.println("[메뉴]\n 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n " +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n " +
                    "8-직업검색\n " +
                    "9-회원수\n ");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("=== 회원가입 ===");
                    msg = uc.join(sc);
                    break;
                case "2":
                    System.out.println("=== 로그인 ===");
                    uc.login(sc);
                    break;
                case "3":
                    System.out.println("=== ID검색 ===");
                    System.out.println(uc.idSearch(sc));

                    break;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    Map<String, UserDTO> users = uc.getUserMap();
                    System.out.println("회원목록 : " + users);
                    break;
                case "8":
                    System.out.println("=== 직업검색 ===");
                    System.out.println("검색완료\n"+uc.jobSearch(sc));
                    break;
                case "9":
                    System.out.println("=== 회원수 ===");
                    String userCount = uc.count();
                    System.out.println("회원수 : " + userCount);
                    return;
            }
        }
    }
}