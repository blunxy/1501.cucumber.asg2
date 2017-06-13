
/**
 * This class calculate the cost to paint a given number of prisms
 * Zephaniah Monette
 * Date created Oct. 10, 2016  
 * Last Modified: Oct. 10, 2016- Wrote code and had no errors. So proud of myself for doing something that really isn't that impressive. 
 */

import java.util.Scanner; 
public class PaintCost
{
    public static void main(String[] args)
    {
        final double PAINT_COST = 1.65;
        double numPrism, len, wid, ht, area, totalCost;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many prisms will you be painting?");
        numPrism = scan.nextInt();
        System.out.println("Enter the length of the prism: ");
        len = scan.nextInt();
        System.out.println("Enter the width of the prism: ");
        wid = scan.nextInt();
        System.out.println("Enter the height of the prism: ");
        ht = scan.nextInt();
        area = 2 * (wid*len + ht*len + ht*wid);
        totalCost = numPrism * PAINT_COST * area;
        System.out.println("The total cost will be: " + totalCost);
        
        
    }

}
