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
