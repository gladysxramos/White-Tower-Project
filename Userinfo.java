import java.util.ArrayList;

public class Userinfo {
    // edit this jared
    private  ArrayList<FoodSpots> foodSpots = new ArrayList<>();
    private static String[] busRoutes = new String[4];
    private String username;
    private String password;
    private ArrayList<String> ratings = new ArrayList<>();


    public Userinfo(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void populateLists(){
        foodSpots.add(new FoodSpots("In N Out", 1.4));
        foodSpots.add(new FoodSpots("Canes", 1.8));
        foodSpots.add(new FoodSpots("Cafe 86", 3.1));
    }
    


}
