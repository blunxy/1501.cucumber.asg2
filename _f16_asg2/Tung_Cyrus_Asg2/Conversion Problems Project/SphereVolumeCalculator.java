/**
* This program calculates the area and estimated total cost of a doomsday device. 
* @author Cyrus Tung
* Date created: October 12, 2016 
* Last Modified: October 12, 2016 - finished the program and added in comment header
*/

import java.util.*;
public class SphereVolumeCalculator
{
    public static void main (String Args[])
    {
        Scanner keyboard = new Scanner(System.in);
        double PI = 3.14;
        double radius;
        double volume;
        double r;
        
        System.out.println("Enter the radius of the sphere: ");
        radius = keyboard.nextDouble(); 
  
        volume = (4.0/3.0) * PI * (radius*radius*radius);
        
        System.out.println("The volume is: " + volume);
    }
}