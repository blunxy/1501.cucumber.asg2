
/**
 * This program calculates an estimate for painting a group of prisms of all the same size.
 * 
 * @author (Kevin Lam) 
 * @version (October 12, 2016)
 */
import java.util.Scanner; 
public class Estimate_Prism
{
    public static void main (String [] args) { final double PAINT_COST = 1.65;
        int numPrism, len, wid, ht;
        Scanner input = new Scanner(System.in);
        System.out.println ("How many prisms will you be painting?: ");
        numPrism = input.nextInt();
        System.out.println ("Enter the length of the prism: ");
        len = input.nextInt();
        System.out.println ("Enter the width of the prism here: ");
        wid = input.nextInt();
        System.out.println ("Enter the height of the prism here: ");
        ht = input.nextInt();
        double area = 2 * ((wid*len) + (ht*len) + (ht*wid));
        double totalCost = numPrism * PAINT_COST * area;
        System.out.println ("The total cost will be: " + totalCost);
        
        
    }
    
}
