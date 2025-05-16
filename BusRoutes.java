public class BusRoutes {
    private String busName;
    private double distance;

    public BusRoutes(String busName, double distance){
        this.busName = busName;
        this.distance = distance;
    }

    public String getBusName(){
        return busName;
    }

    public double getDistance(){
        return distance;
    }

    

}
