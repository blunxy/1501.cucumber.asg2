
/**
 * Write a description of class Doomsday_Calc here.
 * This program will calculate the cost of a doomsday device used to destroy kidney once and for all. 
 * @author (Kevin Lam) 
 * October 12, 2016
 */
import java.util.Scanner; 
public class Doomsday_Calc
{
    public static void main (String[] args) { 
        final double PI = 3.14 , Redan = 1.00 , Goop = 0.75 , Grass = 0.32;
        double height, length;
        Scanner input = new Scanner(System.in);
        System.out.println ("Welcome to doomsday device cost estimater ");
        System.out.println ("Enter the height of the green rectangle here ");
        height = input.nextDouble();
        System.out.println ("Enter the length of the green rectangle here ");
        length = input.nextDouble();
        double radius = length/2;
        double A_Red = length * length;
        double A_Goop = PI * (radius*radius);
        double A_Grass = height*length;
        double C_Redan = A_Red * Redan;
        double C_Goop = A_Goop * Goop;
        double C_Grass = A_Grass * Grass;
        double Total_Cost = C_Grass + C_Goop + C_Redan;
        System.out.println ("Area of redan is " + A_Red + " at the cost of " + C_Redan);
        System.out.println ("Area of goop is " + A_Goop + " at the cost of " + C_Goop);
        System.out.println ("Area of grass is " + A_Grass + " at the cost of " + C_Grass);
        System.out.println ("Total cost of doomsday device is " + Total_Cost);
        
        
        
    }
}
