import java.util.ArrayList;

public class Userinfo {
    // edit this jared
    private static String[][] foodSpots = new String[4][4];
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



    


}
