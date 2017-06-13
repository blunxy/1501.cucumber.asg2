
/**
 * This program gives the cost of each shape depending on the area the user inputs
 * Sam Young
 * October 11th 2016
 * Last modified:
 
 */
import java.util.Scanner;
public class DoomsdayCostEstimator
{
  public static void main(String [ ] args)
  {
      Scanner input = new Scanner (System.in);
      final double PI = 3.14;
      final double GreenRec = 0.32;
      final double YellowCir = 0.75;
      final double RedBox = 1.00;
      double RadiusOfCir,AreaOfCir,AreaOfRed,AreaOfGreen,lenght,height;
      double RedCost,YellowCost,GreenCost,TotalCost;
      System.out.println (" Enter lenght of Green Rectangle: ");
      lenght = input.nextDouble();
      System.out.println (" Enter height of green rectangle: ");
      height = input.nextDouble();
      RadiusOfCir = lenght / 2;
      AreaOfCir = PI * (RadiusOfCir * RadiusOfCir);
      AreaOfGreen = lenght* height;
      AreaOfRed = lenght * RadiusOfCir*2;
      RedCost = 1.00 * AreaOfRed;
      YellowCost = 0.75 * AreaOfCir;
      GreenCost = 0.32 * AreaOfGreen;
      TotalCost = YellowCost + RedCost + GreenCost;
      System.out.println ("Result of Green grass: " + GreenCost);
      System.out.println ("Result Yellow goop: " + YellowCost);
      System.out.println ("Result Red Ants: " + RedCost);
      System.out.println ("Result Total Cost: " + TotalCost);
      
      
      
      
    }
}
