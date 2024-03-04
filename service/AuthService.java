package service;

import model.User;

import java.util.Map;

public interface AuthService {
    String join(User user);
    String login(User build);
    String addUsers();
    User findUser(String username);
    Map<String, User> getUserMap();
    String count();
}