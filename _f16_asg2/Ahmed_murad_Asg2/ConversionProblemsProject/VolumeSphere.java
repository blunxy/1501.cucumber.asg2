/**
 * This program will help solve the volume of a sphere based on the input of the users radius. 
 * 
 * @author Murad Ahmed 
 * @version Oct 9th, 2016 - start date
 */

import java.util.Scanner; 

public class VolumeSphere
{
  public static void main(String[] args) 
    { 
        double radius,volume;
        final double PI=3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        radius = scan.nextDouble();
        volume = (4.0/3.0) * PI * (radius*radius*radius);
        System.out.println("The volume is " + volume );
        
    }
}