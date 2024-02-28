package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDTO> users;


    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }
    public static AuthService getInstance(){return instance;}

    @Override
    public String join(UserDTO user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";

    }

    @Override
    public String login(UserDTO build) {


        return null;
    }

    @Override
    public String addUsers() {
        Map<String, UserDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "";

    }

    @Override
    public UserDTO findUser(String username) {
        UserDTO user = new UserBuilder().build();

        return user;
    }
    @Override
    public Map<String, UserDTO> getUserMap() {
        System.out.println("전체 목록 출력");
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+""; //뒤에 +"" 하면 스트링으로 바뀜
    }
}