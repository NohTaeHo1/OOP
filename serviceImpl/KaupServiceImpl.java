package serviceImpl;

import model.User;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KaupServiceImpl implements KaupService {

    Map<String, User> usersMap;
    ArrayList<User> usersArray;
    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){
        this.usersMap = new HashMap<>();
        usersArray = new ArrayList<>();
    }
    public static KaupService getInstance(){return instance;}

    @Override
    public String createBMI(User user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = (weight/(height*height)*10000);
        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double bmiDouble = Double.parseDouble(bmi);
        String result = "";
        if (bmiDouble < 18.5) {
            result = "저체중";
        } else if (18.5 <= bmiDouble && bmiDouble <= 23) {
            result = "정상";
        } else if (23 < bmiDouble && bmiDouble < 25) {
            result = "과체중";
        } else {
            result = "비만";

        }
        return result;
    }

}