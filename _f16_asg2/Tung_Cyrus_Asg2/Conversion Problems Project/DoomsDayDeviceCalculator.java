/**
* This program calculates the area and estimated total cost of a doomsday device. 
* @author Cyrus Tung
* Date created: October 12, 2016 
* Last Modified: October 12, 2016 - finished the program and added in comment header
*/

import java.util.*;
public class DoomsDayDeviceCalculator
{
    public static void main (String Args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        double PI = 3.14;
        double length;
        double height;
        double radius;
        double rectangleArea;
        double circleArea;
        double squareArea;
        double greenRectangleAreaCost;
        double redSquareAreaCost;
        double yellowCircleAreaCost; 
        double totalCost; 
        
        //I know I could've shortened the variable names and data types. 
        //But I just like the look of this better
        //double length, height, radius, rectangleArea, circleArea, squareArea etc. 
        
        System.out.println("Welcome to the doomsday device cost estimator");
        System.out.print("Enter the length of the green rectangle (in centimeters): ");
        length = keyboard.nextDouble();
        System.out.print("Enter the height of the green rectangle (in centimeters); ");
        height = keyboard.nextDouble();
        
        radius = length / 2.0;
        rectangleArea = length * height;
        circleArea = PI * (radius * radius);
        squareArea = length * length; 
        
        greenRectangleAreaCost = rectangleArea * 0.32;
        yellowCircleAreaCost = circleArea * 0.75;
        redSquareAreaCost = squareArea *1.00;
        
        totalCost = greenRectangleAreaCost + yellowCircleAreaCost + redSquareAreaCost; 
        
        System.out.print("The area of the green grass is " + rectangleArea);
        System.out.println(" at a cost of $" + greenRectangleAreaCost);
        System.out.print("The area of the yellow good is " + circleArea);
        System.out.println(" at a cost of $" + yellowCircleAreaCost);
        System.out.print("The area of the red ants is " + squareArea);
        System.out.println(" at a cost of $" + redSquareAreaCost); 
        System.out.println("The total cost of the device is $" + totalCost);
        
    }
}
