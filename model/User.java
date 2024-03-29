package model;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString


public class User {

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

    @Builder(builderMethodName = "builder")
    public User(String username, String passwordConfirm, String password, String name, String ssn, String phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.passwordConfirm = passwordConfirm;
        this.password = password;
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
}