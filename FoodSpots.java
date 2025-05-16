public class FoodSpots {
    private String resturant;
    private double distance;
    
    public FoodSpots(String resturant, double distance){
        this.resturant = resturant;
        this.distance = distance;
    }

    public String getRestaurant(){
        return resturant;
    }

    public double getDistance(){
        return distance;
    }

}

class Cuisine extends FoodSpots{
    private String typeOfFood;

    public Cuisine(String restaurant, double distance, String typeOfFood){
        super(restaurant, distance);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood(){
        return typeOfFood;
    }
}





