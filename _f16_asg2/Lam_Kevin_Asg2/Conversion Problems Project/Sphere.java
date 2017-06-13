
/**
 * Used to calculate the volume of a sphere.
 * 
 * @author (Kevin Lam) 
 * @version (October 11, 2016)
 */
import java.util.Scanner; 
public class Sphere
{ public static void main (String[] args) { double radius; 
    final double PI = 3.14;
    Scanner scan = new Scanner(System.in);
    System.out.println ("Enter the radius of the sphere here: ");
    radius = scan.nextDouble ();
    double volume = ((4.0/3.0) * (PI) * (radius*radius*radius));
    System.out.println ("The volume is " + volume);
    
    
    
    
}
    
}