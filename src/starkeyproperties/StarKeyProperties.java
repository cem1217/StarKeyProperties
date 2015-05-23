/*
 * 
 */
package starkeyproperties;

/**
 *
 * @author Clara Ellie
 */
public class StarKeyProperties {

    /**
     * 
     */
    public static void main(String[] args) {
        // test distance
        
        Distance noDistance = new Distance();
        System.out.println("distance = " + noDistance.getDistance());
        System.out.println("has distance?: " + noDistance.checkDistance());
        
        double x = 8.595;
        Distance distance = new Distance(x);
        System.out.println("distance = " + distance.getDistance());
        System.out.println("has distance?: " + distance.checkDistance());
        
        double z = 9.555;
        Parallax parallax = new Parallax(z);
        Distance pDistance = new Distance(parallax);
        System.out.println("Parallax = " + parallax.getParallax());
        System.out.println("1/parallax = " + 1/parallax.getParallax());
        System.out.println("Distance = " + pDistance.getDistance());
    }
    
}
