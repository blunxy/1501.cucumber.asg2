
/**
* Calculates the volume of a sphere when user inputs radius
* @author Kaitlyn Luft
* Date created: Oct 12, 2016
* Last Modified: Oct 12, 2016 - start
*/
import java.util.Scanner;
public class SphereVolumeCalculator
{
   public static void main (String[]args){
        final double PI = 3.14;
        double radius,volume;
        Scanner input = new Scanner(System.in);
        //set PI = 3.14
        //write “Enter the radius of the sphere: ”
        System.out.println("Enter the radius of the spheres: ");
        //read radius
        radius = input.nextDouble();
        //set volume = (4/3) * PI * (radius*radius*radius)
        volume= (4.0/3.0)*PI* (radius*radius*radius);
        //write “The volume is ”,volume
        System.out.println("The volume is "+volume);
    }
}
