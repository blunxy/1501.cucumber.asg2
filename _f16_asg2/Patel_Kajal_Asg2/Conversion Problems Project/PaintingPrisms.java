
/**
 * This program estimates the cost of painting a group of prisms. 
 * 
 * @author Kajal Patel 
 * Date created: October 10, 2016
 * Last Modified: October 10, 2016- assignment started
 */
import java.util.Scanner;
public class PaintingPrisms

{public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        final double paintCost=1.65;
        System.out.println("How many prisms will you be painting?:");
        double numPrism=input.nextDouble();
        System.out.println("Enter length of prism");
        double len=input.nextDouble();
        System.out.println("Enter width of prism:");
        double wid=input.nextDouble();
        System.out.println("Enter height of prism:");
        double ht=input.nextDouble();
        double area=2*((wid*len)+(ht*len)+(ht*wid));
        double totalCost=numPrism*paintCost*area;
        System.out.println("The total cost will be:" +totalCost);}
        
        
        
     
    
}
