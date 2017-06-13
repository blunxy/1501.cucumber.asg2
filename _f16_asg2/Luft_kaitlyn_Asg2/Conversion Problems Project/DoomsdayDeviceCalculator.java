
/**
* Calculates the cost of building a doomsday machine out of grass, ants, and science goop.
* @author Kaitlyn Luft
* Date created: Oct 12, 2016
* Last Modified: Oct 12, 2016 - start
*/
import java.util.Scanner;
public class DoomsdayDeviceCalculator
{ public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    double len, ht,GreenArea,YellowArea, RedArea, TotalCost;
    final double RedPrice=1.00,YellowPrice=0.75, GreenPrice=0.32, PI=3.14;
   //write" Welcome to the doomsday device cost estimator"
    System.out.println("Welcome to the doomsday device cost estimator");
   //write"Enter the length of the green rectangle (in centimeters): "
   System.out.print("Enter the length of the green rectangle (in centimeters): ");
   len = input.nextDouble();
   //write"Enter the height of the green rectangle (in cen;timeters): "
   System.out.print("Enter the height ig the green rectangle (in centimeters): ");
   ht = input.nextDouble();
     //write "The area of the green grass is "GreenArea "at a cost of " GreenCost
   System.out.println("The area of the green grass is "+(ht*len)+ " at the cost of $"+ (ht*len)*GreenPrice);
   //write The area of the yellow goop is 78.5 at a cost of $58.875
   YellowArea= PI*(0.5*len)*(0.5*len);
   System.out.println("The area of the yellow goop is "+ YellowArea+" at a cost of $"+ YellowArea*YellowPrice);
   //writeThe area of the red ants is 100.0 at a cost of $100.0
   RedArea= len*len;
   System.out.println("The area of the red ants is "+RedArea+" at a cost of $"+RedArea*RedPrice);
   //writeTotal cost of the device is $174.875
   System.out.println("Total cost of the device is $"+ (RedArea*RedPrice+YellowArea*YellowPrice+ht*len*GreenPrice)); 
    
    }
}
