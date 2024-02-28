package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import repository.UserRepository;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();

    private UserServiceImpl() {
    }

    public static UserService getInstance() {
        return instance;
    }
    UserRepository a;

    Map<String, UserDTO> users;

    @Override
    public String addUsers() {
        Map<String, UserDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomUsername())
                            .build());
        }
        users = map;
        return "addUsers 결과 : " + map.size() + " 개 더미값 추가";
    }

    @Override
    public String count() {
        return users.size() + "";
    }

    @Override
    public String join(UserDTO user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public Map<String, UserDTO> getUserMap() {
        System.out.println("전체 목록 출력");
        users.forEach((k, v) -> System.out.print("{" + k + "," + v));
        return users;
    }

    @Override
    public String login(UserDTO userDTO) {
        String id = userDTO.getUsername();
        String pw = userDTO.getPassword();

        UserDTO u = users.get(id);

        if(u == null) {
            System.out.println("없음");
        } else if(u.getPassword() != pw) {
            System.out.println("틀림");
        } else {
            System.out.println("로그인 성공");
        }

/*        if (id.equals(u.getUsername())) {
            if (pw.equals(u.getPassword())) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패");
            }
        } else {
            System.out.println("로그인 실패");
        }*/

        return null;
    }

    @Override
    public String idSearch(UserDTO ud) {
        UserDTO userDTO = users.get(ud.getUsername());
        if(userDTO == null ){
            System.out.println("해당 ID가 존재하지 않습니다.");
        }
        else{
            System.out.println(userDTO);
        }
        return null;
    }
    /*
    UserDTO userDTO = users.get("입력아이디");
    String pw = userDTO.getPassword();
    if (a == null){
        System.out.println("해당 ID는 회원이 아닙니다.");
    }
    else{
        System.out.println("해당 ID는 회원입니다.");
    }

     */
}


