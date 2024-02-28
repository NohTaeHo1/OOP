package service;

import model.UserDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(UserDTO user);
    String login(UserDTO build);
    String addUsers();
    UserDTO findUser(String username);
    Map<String, UserDTO> getUserMap();
    String count();
}