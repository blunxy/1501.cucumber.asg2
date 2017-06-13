
/**
 * This Program calculates how much it will cost to paint the amount of prisms the user wants 
 * Sam Young
 * October 9th 2016 
 * Last modified:
 */
import java.util.Scanner;
public class TotCostOfPrism
{
 public static void main (String [ ] args)
 {
     Scanner input = new Scanner(System.in);
     final double PAINT_COST = 1.65;
     double length,width,height;
     double TotalCost,area;
     int prisms;
     System.out.println (" How many prisms will you be painting?: ");
     prisms = input.nextInt();
     System.out.println (" Enter the lenght of the prism: ");
     length = input.nextDouble();
     System.out.println (" Enter width of the prism: ");
     width = input.nextDouble();
     System.out.println (" Enter the height of the prism: ");
     height = input.nextDouble();
     area =2* (width*length+height*length+height*width);
     TotalCost = prisms * PAINT_COST * area;
     System.out.println ("The total cost will be: " + TotalCost);
     
    }
}
