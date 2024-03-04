package service;

import model.User;

import java.util.Map;

public interface UserService {
    String addUsers();
    String count();

    String join(User build);

    Map<String, User> getUserMap();

    String login(User build);

    String idSearch(User build);

    User jobSearch(User build);
}