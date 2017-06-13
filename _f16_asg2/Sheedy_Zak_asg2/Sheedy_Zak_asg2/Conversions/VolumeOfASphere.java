
/**
 * This program calculates the volume of a sphere
 * @author Zak Sheedy 
 * Date created : 12-10-2106
 * Last Modified : October 12, 2016 - Started the assignment lol
 */

import java.util.Scanner;
public class VolumeOfASphere

{

  public static void main (String[] args)
  { double PI= 3.14, radius, volume;
    Scanner scan = new Scanner (System.in);  
      System.out.print ("Enter the radius of the sphere: ");
      radius = scan.nextDouble();
      volume = ((4) * (PI) * (radius * radius * radius))/3;
      System.out.println ("The volume is " + volume);
      
}
}
