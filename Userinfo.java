import java.util.ArrayList;

public class Userinfo {
    private ArrayList<FoodSpots> foodSpots = new ArrayList<>();
    private ArrayList<BusRoutes> busRoutes = new ArrayList<>();
    private Object[][] correspondingAreas = new Object[10][2];
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
        //Populate Food Spots
        foodSpots.add(new Cuisine("In N Out", 1.4));
        foodSpots.add(new Cuisine("Canes", 1.8));
        foodSpots.add(new Cuisine("Cafe 86", 3.1));
        foodSpots.add(new Cuisine("Lucky Star Cafe", 1.6));
        foodSpots.add(new Cuisine("Gen Korean BBQ", 8.1));
        foodSpots.add(new Cuisine("Pho Crystal", 2.6));
        foodSpots.add(new Cuisine("Aduke Nigerian Cuisine", 13.8));
        foodSpots.add(new Cuisine("J Sushi", 2.4));
        foodSpots.add(new Cuisine("Olive Garden", 8.9));
        foodSpots.add(new Cuisine("King Taco", 8.9));

        // Populate Bus Routes
        busRoutes.add(new BusRoutes("Torrance 13 to Artesia", 0.4));
        busRoutes.add(new BusRoutes("Long Beach Transit 2 to Sepuvelda", 0.4));
        busRoutes.add(new BusRoutes("LA Transit 246 to San Pedro", 0.8));
        busRoutes.add(new BusRoutes("LA Transit 53 to Downtown LA", 0.5));
        busRoutes.add(new BusRoutes("LA Transit 205 to San Pedro and Torrance 9 to Del Amo", 0.8));
        busRoutes.add(new BusRoutes("LA 205 to Willowbrooks/Rosa Park Station", 0.8));
        busRoutes.add(new BusRoutes("LA 51 to 7th St, LA C Line to Aviation/LAX, and 857 to Westchester", 0.6));
        busRoutes.add(new BusRoutes("LA 246 to San Pedro", 0.8));
        busRoutes.add(new BusRoutes("Torrance 13 to Redondo Beach and LA 344 to Rancho Palos Verdes", 0.5));
        busRoutes.add(new BusRoutes("Torrance 6 to Artesia and LA 60 to Downtown LA", 0.6));

        // Populate correspondingAreas array
        for (int i = 0; i < foodSpots.size(); i++) {
            correspondingAreas[i][0] = foodSpots.get(i);
            correspondingAreas[i][1] = busRoutes.get(i);
        }
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
