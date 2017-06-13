/**
 * This program helps calculate the cost of buliding  the doomsday device based upon the given dimensions.  
 * 
 * @author murad Ahmed
 * @version Oct 10th, 2016 - start date 
 */

import java.util.Scanner; 


public class DoomsdayDevice
{
    public static void main(String[] args)
    { 
        double len, hgt, green, yellow, red, redCost, yellowCost, greenCost, TotalCost; 
        final double GREEN_RATE = 0.32, YELLOW_RATE = 0.75, RED_RATE = 1.00;
        System.out.println("Welcome to the doomsay device cost estimator");
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the length of the green rectangle:");
        len = scan.nextDouble();
        System.out.println("Enter the length of the green rectangle");
        hgt = scan.nextDouble(); 
        green = len * hgt;
        greenCost = green * GREEN_RATE ;
        yellow = 3.14*((len/2)*(len/2)) ;
        yellowCost = yellow * YELLOW_RATE ;
        red = (len * len) ;
        redCost = red * RED_RATE;
        System.out.println("The area of the green grass is " + green + " at a cost of $" + greenCost);
        System.out.println("The area of the yellow goop is " + yellow + " at a cost of $" + yellowCost);
        System.out.println("The area of red ants is " + red + " at a cost of $" + redCost);
        TotalCost = (redCost+yellowCost+greenCost);
        System.out.println("Total cost of the device is $" + TotalCost ); 
    }
}
