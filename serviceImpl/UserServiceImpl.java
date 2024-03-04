package serviceImpl;

import model.User;
import repository.UserRepository;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();

    private UserServiceImpl() {
    }

    public static UserService getInstance() {
        return instance;
    }
    UserRepository a;

    Map<String, User> users;

    @Override
    public User jobSearch(User build) {
        String findUserName ="";
        for(String key : users.keySet()){
            User information = users.get(key);
            if(build.getJob().equals(information.getJob())){
                findUserName = key;
            }
        }

        return users.get(findUserName);

    }

    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username,
                    User.builder()
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
    public String join(User user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public Map<String, User> getUserMap() {
        System.out.println("전체 목록 출력");
        users.forEach((k, v) -> System.out.print("{" + k + "," + v));
        return users;
    }

    @Override
    public String login(User userDTO) {
        String id = userDTO.getUsername();
        String pw = userDTO.getPassword();

        User u = users.get(id);

        if(u == null) {
            System.out.println("없음");
        } else if(u.getPassword().equals(pw)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("틀림");
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
    public String idSearch(User ud) {
        User userDTO = users.get(ud.getUsername());
        if(userDTO == null ){
            return "해당 ID가 존재하지 않습니다.";
        }
        else{
            System.out.println(userDTO);
            return "아이디 검색 성공";
        }
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


