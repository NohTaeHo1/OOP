package model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UserDTO {

    //private String id;

    private String username;
    private String passwordConfirm;
    private String password;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;



}