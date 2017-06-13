
/**
 * This program will calculate the cost to paint groups of prisms 
 * 
 * @author Murad Ahmed
 * @version Oct 10,2016 - start date
 */

import java.util.Scanner;

public class CostPaint
{
   public static void main(String[] args) 
   { 
       double numPrism, len, wid, ht, area, totalCost;
       final double PAINT_COST = 1.65;
       Scanner scan = new Scanner(System.in); 
       System.out.println("How many prisms will you be painting?: ");
       numPrism = scan.nextInt();
       System.out.println("Enter the length of the prism: ");
       len = scan.nextDouble();
       System.out.println("Enter the width of the prsim: ");
       wid = scan.nextDouble();
       System.out.println("Enter the height og the prism: ");
       ht = scan.nextDouble(); 
       area = 2 * (wid*len + ht*len + ht*wid) ;
       totalCost = numPrism * PAINT_COST * area;
       System.out.println("The total cost will be: " +totalCost );
    }
}
       
       
  
       
       
