/**
* This program calculates the area and estimated total cost of a doomsday device. 
* @author Cyrus Tung
* Date created: October 12, 2016 
* Last Modified: October 12, 2016 - finished the program and added in comment header
*/

import java.util.*;
public class PrismPaintingCostCalculator
{
    public static void main (String Args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        
        double PAINT_COST = 1.65;
        double numPrisms; 
        double length;
        double width;
        double height;
        double area; 
        double totalCost;
        
        System.out.println("How many prisms will you be painting? ");
        numPrisms = keyboard.nextDouble();
        System.out.println("Enter the length of the prism: ");
        length = keyboard.nextDouble();
        System.out.println("Enter the width of the prism: ");
        width = keyboard.nextDouble();
        System.out.println("Enter the height of the prism: ");
        height = keyboard.nextDouble();
        
        area = 2.0 * ((width * length) + (height * length) + (height * width));
        totalCost = numPrisms * PAINT_COST * area;
        
        System.out.println("The total cost will be: " + totalCost);
        
    }
}