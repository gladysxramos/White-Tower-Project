/*+----------------------------------------------------------------------
 ||
 ||  Class: FoodSpots
 ||
 ||         Author:  Gladys Ramos, Jared Gonzales
 ||
 ||        Purpose:  Create an instance object that holds information about the resturant
 ||
 ||  Inherits From: Cuisine inherits FoodSpots and adds a new variable to the Foodspot which is the type of food that the resuturant serves
 ||
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Constants:  String resturances: holds the name of the resturant
 ||                  double distance: holds a the distance in miles from CAMS
 ||                  String typeOfFood: holds the type of Cuisine that the resturant sells
 ||
 |+-----------------------------------------------------------------------
 ||
 ||   Constructors:  FoodSpots constructor takes two parameters: the resturant name and the distance from CAMS
 ||                  The Cuisine constructor takes a three parameters: the same as the FoodSpots with the new one being typeOfFood
 ||
 ||
 ||  Inst. Methods:  getter methods only
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

    // getter methods
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





