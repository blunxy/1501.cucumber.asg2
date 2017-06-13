/**
* Calculates the cost of paint for any number of prisms of the same size
* @author Kaitlyn Luft
* Date created: Oct 12, 2016
* Last Modified: Oct 12, 2016 - start
*/
import java.util.Scanner;
public class CostOfPrisms
{public static void main (String[]args){
      Scanner input = new Scanner(System.in);
      final double PAINT_COST = 1.65;
      double numPrism, len, wid, ht, area, totalCost;
      //set PAINT_COST = 1.65
      //write “How many prisms will you be painting?: ”
      System.out.println("How many prisms will you be painting?");
      //read numPrism
      numPrism=input.nextDouble();
      //write “Enter the length of the prism: ”
      System.out.println("Enter the length of the prism: ");
      //read len
      len = input.nextDouble();
      //write “Enter the width of the prism: ”
      System.out.println("Enter the width of the prism: ");
      //read wid
      wid= input.nextDouble();
      //write “Enter the height of the prism: ”
      System.out.println("enter the height of the prism: ");
      //read ht
      ht= input.nextDouble();
      //set area = 2 * ( wid*len + ht*len + ht*wid)
      area= 2*(wid*len+ht*len+ht*wid);
      //set totalCost = numPrism * PAINT_COST * area
      totalCost = numPrism* PAINT_COST * area;
      //write “The total cost will be: ”, totalCost  
      System.out.println("The total cost will be: "+totalCost);
    }
}
