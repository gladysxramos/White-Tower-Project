/*+----------------------------------------------------------------------
 ||
 ||  Class [Class Name] 
 ||
 ||         Author:  [Your Name]
 ||
 ||        Purpose:  [A description of why this class exists.  For what
 ||                   reason was it written?  Which jobs does it perform?]
 ||
 ||  Inherits From:  [If this class is a subclass of another, name it.
 ||                   If not, just say "None."]
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
public class FoodSpots {
    // private nonstatic variables
    private String restaurant;
    private double distance;
    
    public FoodSpots(String restaurant, double distance){
        this.restaurant = restaurant;
        this.distance = distance;
    }

    // getter and setter methods
    public String getRestaurant(){
        return restaurant;
    }

    public double getDistance(){
        return distance;
    }

}

// inheritance 
class Cuisine extends FoodSpots{
    // private nonstatic variable
    private String typeOfFood;

    public Cuisine(String restaurant, double distance, String typeOfFood){
        // use the constructor from the super class
        super(restaurant, distance);
        // declare new variable
        this.typeOfFood = typeOfFood;
    }

    // getter method
    public String getTypeOfFood(){
        return typeOfFood;
    }
}





