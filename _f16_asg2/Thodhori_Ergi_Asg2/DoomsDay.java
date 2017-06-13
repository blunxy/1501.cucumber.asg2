
/**
* This program generates the price of the Doomsday device
* @author: Ergi Thodhori
* Date created: October 4th, 2016
* Last Modified: Date of modification: October 4th, 2016
*/
import java.util.Scanner;
public class DoomsDay
{public static void main (String[] args){
    Scanner scan = new Scanner (System.in);
    double length, height, ARectangle, ACircle, radius, PI, RecCost, CircleCost,ARedAnts,RedAntsCost,TotalCost;
    System.out.println("Welcome to the doomsday device cost estimator");
    
    System.out.print("Enter length of the green rectangle: ");
    length = scan.nextInt();
    
    System.out.print("Enter the height of the green rectangle: ");
    height = scan.nextInt();
    
    radius = (length/2);
    
    PI = 3.14;
    
    ARectangle = (height*length);
    RecCost = (0.32*ARectangle);
    System.out.println("The area of the green grass is " + ARectangle + " at a cost of $" + RecCost);
    
    ACircle = (PI*(radius*radius));
    CircleCost = (0.75*ACircle);
    System.out.println("The area of the yellow goop is " + ACircle + " at a cost of $" + CircleCost);
    
    ARedAnts = (length*length)-((ARectangle)+(PI*(radius*radius)));
    RedAntsCost = (1.00*ARedAnts);
    System.out.println("The area of the red ants is " + ARedAnts + " at a cost of $" + RedAntsCost);
    
    TotalCost = (RecCost+CircleCost+RedAntsCost);
    System.out.print("The total cost of the device is $"+ TotalCost);
}
}
