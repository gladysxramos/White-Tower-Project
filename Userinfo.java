import java.util.ArrayList;

public class Userinfo {
    // edit this jared
    private ArrayList<FoodSpots> foodSpots = new ArrayList<>();
    private static ArrayList<BusRoutes> busRoutes = new ArrayList<>();
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
        foodSpots.add(new Cuisine("In N Out", 1.4, "American"));
        foodSpots.add(new FoodSpots("Canes", 1.8));
        foodSpots.add(new FoodSpots("Cafe 86", 3.1));
        
        busRoutes.add(new BusRoutes("password", 0));
        
    }
    
    public void addFoodSpot(FoodSpots spot) {
        foodSpots.add(spot);
    }

    public ArrayList<FoodSpots> getFoodSpots() {
        return foodSpots;
    }

    public void addRating(String rating) {
        ratings.add(rating);
    }

    public ArrayList<String> getRatings() {
        return ratings;
    }
}
