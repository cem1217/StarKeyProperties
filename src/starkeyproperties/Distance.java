/*
 * 
 */
package starkeyproperties;

/**
 *
 * @author Clara Ellie
 */
public class Distance {
    
    private double distance;
    private Boolean hasDistance = false;
    
    public Distance() {
        distance = 0.0;
    }
    
    public Distance(double passedDistance){
        distance = passedDistance;
        hasDistance = true;
    }
    
    public Distance(Parallax parallax) {
        distance = 1/parallax.getParallax();
    }
    
    public Boolean checkDistance() {        
        return hasDistance;
    }
    
    public double getDistance() {
        double sendDistance = distance;
        return sendDistance;
    }
    
}
