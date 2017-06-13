
/**
 * This class will output the volume of a sphere
 * Zephaniah Monette
 * Date created Oct. 10, 2016  
 * Last Modified: Oct. 10,2016- Wrote program and elimianted bugs. (4/3) vs (4.0/3.0)
 */

import java.util.Scanner; 
public class SphereVolume
{
    public static void main (String[] args)
    {
        double radius, volume;
        final double PI = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        radius = scan.nextInt(); 
        volume = (4.0/3.0) * PI *(radius*radius*radius);
        System.out.println("The volume is: "+ volume);
    }
    
    
}
