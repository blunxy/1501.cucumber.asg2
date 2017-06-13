/**
* Estimates the total cost of getting painting prisms
* @ Ergi Thodhori
* Date created: October 3rd 2016
* Last Modified: Date of modification – October 4, 2016
*/
import java.util.Scanner;
public class PrismPainting{
  public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
      double PAINT_COST = 1.65, numPrism,wid,ht,area,totalCost,len;
      
      System.out.println("Enter the length of the prism ");
      len = scan.nextInt();
      
      System.out.println("How many prisms will you be printing: ");
      numPrism = scan.nextInt();
      
      System.out.println("Enter the width of the prism: ");
      wid = scan.nextInt();
      
      System.out.println("Enter the height of the prism: ");
      ht = scan.nextInt();
      
      area = 2*(wid*len + ht*len + ht*wid);
      totalCost = numPrism*PAINT_COST*area;
      System.out.print("The total cost will be: "+ totalCost);
    }
}
