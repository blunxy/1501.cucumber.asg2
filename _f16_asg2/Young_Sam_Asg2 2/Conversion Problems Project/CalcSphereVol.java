
/**
 * Calculating the Volume of a sphere
 * Sam Young
 * October 9th 2016
 * Last Modified
 */
import java.util.Scanner;


public class CalcSphereVol
{ 
    public static void main (String [ ] args)
    {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14 ;
        double radius;
        double volume;
        System.out.println ("Enter the radius of the sphere:");
        radius = input.nextDouble();
        volume = (4.0/3.0) * PI * (radius*radius*radius);
        System.out.println ("The volume is " + volume); 
    }
}
