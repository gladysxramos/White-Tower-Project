public class FoodSpots {
    private String restaurant;
    private double distance;
    
    public FoodSpots(String restaurant, double distance){
        this.restaurant = restaurant;
        this.distance = distance;
    }

    public String getRestaurant(){
        return restaurant;
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





