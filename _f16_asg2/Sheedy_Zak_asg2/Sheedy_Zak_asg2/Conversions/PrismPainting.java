
/**
 * This program is used to calculate cost for painting prisms.
 * @author Zak Sheedy 
 * Date Created: 12-10-2016
 * Last Modified : October 12, 2016 - Started the assignment
 */
import java.util.Scanner;
public class PrismPainting
{
    public static void main (String[] args)
    {
        double PAINT_COST = 1.65, numPrism, len, wid, ht, area, totalCost;
        Scanner scan = new Scanner (System.in);
        System.out.print ("How many prisms will you be painting?: ");
        numPrism = scan.nextDouble();
        System.out.print ("Enter the length of the prism: ");
        len = scan.nextDouble();
        System.out.print ("Enter the width of the prism: ");
        wid = scan.nextDouble();
        System.out.print ("Enter the height of the prism: ");
        ht = scan.nextDouble();
        area = 2 * (wid*len + ht*len + ht*wid);
        totalCost = numPrism * PAINT_COST * area;
        System.out.print ("The total cost will be: " + totalCost);
}
}
