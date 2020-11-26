package models.services.user;

public class UserService {
    public boolean login(String uName, String password){
        boolean isLogined = false;
        if(uName.equals("admin") && password.equals("admin")){
            isLogined = true;
        }
        return isLogined;
    }

}
