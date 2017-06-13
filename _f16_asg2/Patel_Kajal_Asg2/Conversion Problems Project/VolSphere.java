/**
* This program calculates the volume of a sphere.
* @author Kajal Patel
* Date created: October 10, 2016
* Last Modified: October 10, 2016 - assignment started.
*/

import java.util.Scanner;
public class VolSphere
{
    public static void main (String[]args)
    {Scanner input = new Scanner (System.in);
     double PI=3.14;
     System.out.println("Enter value of radius");
     double radius= input.nextDouble();
     double volSphere=(4.0/3.0)*PI*(radius*radius*radius);
     System.out.println("The volume of the sphere is:"+volSphere);}
     
}
