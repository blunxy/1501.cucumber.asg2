/**
 * This class will output the cost of the Doomsday device
 * Zephaniah Monette
 * Date created Oct. 10, 2016  
 * Last Modified: Oct. 10,2016- Wrote program and had mind blown by the backstory. 
 */

import java.util.Scanner;

public class DoomsdayCost
{
    public static void main(String[] args) 
    {
        final double PI = 3.14, red = 1.0, yellow = 0.75, green = 0.32, radius= length/2 ;
        double length, height, area_green, area_yellow, area_red, cost_green, cost_yellow, cost_red, total_cost;
        System.out.println("Welcome to the doomsday device cost estimator. ");
        System.out.println("Enter the length of the green rectangle (in centimeters): ");
        numPrism = scan.nextInt();
        System.out.println("Enter the height of the green rectangle (in centimeters): ");
        numPrism = scan.nextInt();
        area_green = length * height;
        area_yellow = PI * (radius * radius);
        area_red = length * length;
        cost_green = length * height * green;
        cost_yellow = PI * yellow * (radius * radius);
        cost_red = length * length * red;
        total_cost = cost_red + cos_yellow + cost_green;
        System.out.println("The area of the yellow goop is:" + area_yellow + "at a cost of: " + cost_yellow);
        System.out.println("The area of the red ants is:" + area_red + "at a cost of: " + cost_red);
        System.out.println("The area of the green grass is:" + area_green + "at a cost of: " + cost_green);
        System.out.println("The total cost is: " + total_cost); 
    }
}
