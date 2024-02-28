package service;

import model.UserDTO;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String addUsers();
    String count();

    String join(UserDTO build);

    Map<String, UserDTO> getUserMap();

    String login(UserDTO build);

    String idSearch(UserDTO build);
}