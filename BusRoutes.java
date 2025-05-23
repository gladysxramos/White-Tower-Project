/*+----------------------------------------------------------------------
 ||
 ||  Class BusRoutes
 ||
 ||         Author:  Gladys Ramos, Jared Gonzales
 ||
 ||        Purpose:  Create an object reference that holds the name of the bus route and how far it is from CAMS
 ||
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Constants: String busName: holds the bus route name
 ||                 double disntance: holds how far the bus route is from CAMS
 ||
 |+-----------------------------------------------------------------------
 ||
 ||   Constructors: BusRoutes constructor has two parameters: busName and distance
 ||
 ||
 ||  Inst. Methods:  getter methods only
 ||
 ++-----------------------------------------------------------------------*/
public class BusRoutes {
    // private nontatic variables
    private String busName;
    private double distance;

    // bus route constructors
    public BusRoutes(String busName, double distance){
        this.busName = busName;
        this.distance = distance;
    }

    // getter and setter methods
    public String getBusName(){
        return busName;
    }

    public double getDistance(){
        return distance;
    }

    

}
