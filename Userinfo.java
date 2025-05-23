/*+----------------------------------------------------------------------
 ||
 ||  Class [Class Name] 
 ||
 ||         Author:  [Your Name]
 ||
 ||        Purpose:  [A description of why this class exists.  For what
 ||                   reason was it written?  Which jobs does it perform?]
 ||
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Constants:  [Name all public class constants, and provide a very
 ||                   brief (but useful!) description of each.]
 ||
 |+-----------------------------------------------------------------------
 ||
 ||   Constructors:  [List the names and arguments of all defined
 ||                   constructors.]
 ||
 ||
 ||  Inst. Methods:  [List the names, arguments, and return types of all
 ||                   public instance methods.]
 ||
 ++-----------------------------------------------------------------------*/
import java.util.ArrayList;

public class Userinfo {
    private ArrayList<FoodSpots> foodSpots = new ArrayList<>();
    private ArrayList<BusRoutes> busRoutes = new ArrayList<>();
    private ArrayList<ArrayList<Object>> correspondingAreas = new ArrayList<>();
    private String username;
    private String password;


    public Userinfo(String username, String password){
        this.username = username;
        this.password = password;
    }

    //getter methods

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    // populate individual lists
    public void populateLists(){
       
        foodSpots.add(new Cuisine("In N Out", 1.4, "American"));
        foodSpots.add(new Cuisine("Canes", 1.8, "American"));
        foodSpots.add(new Cuisine("Cafe 86", 3.1, "Filipino"));
        foodSpots.add(new Cuisine("Lucky Star Cafe", 1.6, "Mexican"));
        foodSpots.add(new Cuisine("Gen Korean BBQ", 8.1, "Korean"));
        foodSpots.add(new Cuisine("Pho Crystal", 2.6, "Vietnamese"));
        foodSpots.add(new Cuisine("Aduke Nigerian Cuisine", 13.8, "Nigerian"));
        foodSpots.add(new Cuisine("J Sushi", 2.4, "Japanese"));
        foodSpots.add(new Cuisine("Olive Garden", 8.9, "Italian"));
        foodSpots.add(new Cuisine("King Taco", 8.9, "Mexican"));

       
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

  
    }

    // populate corresponding list
    public void populateCorresponding() {
        for (int i = 0; i < foodSpots.size(); i++) {
            ArrayList<Object> pair = new ArrayList<>();
            pair.add(foodSpots.get(i));
            pair.add(busRoutes.get(i));
            correspondingAreas.add(pair);
        }
    }
    
   // getter methods
    public ArrayList<FoodSpots> getFoodSpots() {
        return foodSpots;
    }

    public ArrayList<ArrayList<Object>> getCorrespondingAreas() {
        return correspondingAreas;
    }

    
    @Override
    public String toString() {
        String result = String.format("%-5s | %-30s | %-50s\n", "No.", "Food Spots", "Bus Routes");
        result += String.format("%-5s-+-%-30s-+-%-50s\n", "-----", "------------------------------", "--------------------------------------------------");
        
        int count = 1;
        for (ArrayList<Object> pair : correspondingAreas) {
            FoodSpots foodSpot = (FoodSpots) pair.get(0);
            BusRoutes busRoute = (BusRoutes) pair.get(1);
            result += String.format("%-5d | %-30s | %-50s\n", 
                count++,
                foodSpot.getRestaurant(), 
                busRoute.getBusName());
        }
        
        return result;
    }

}
