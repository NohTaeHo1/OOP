package serviceImpl;

import model.User;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, User> users;
    ArrayList<User> userslist;


    private AuthServiceImpl(){
        this.users = new HashMap<>();
        this.userslist = new ArrayList<>();
    }
    public static AuthService getInstance(){return instance;}




    @Override
    public String join(User user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";

    }

    @Override
    public String login(User build) {


        return null;
    }

    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username,
                    User.builder()
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
    public User findUser(String username) {
        User user = User.builder().build();

        return user;
    }
    @Override
    public Map<String, User> getUserMap() {
        System.out.println("전체 목록 출력");
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+""; //뒤에 +"" 하면 스트링으로 바뀜
    }
}