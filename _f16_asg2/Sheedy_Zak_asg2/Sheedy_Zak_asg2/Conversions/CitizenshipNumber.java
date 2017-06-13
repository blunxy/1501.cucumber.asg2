
/**
 * This algorithm is used to generate 6-digit citizenship numbers
 * @author Zak Sheedy 
 * Date created: 12-10-2016
 * Last Modified: October 12, 2016 - Started the assignment 
 */
import java.util.Scanner;
public class CitizenshipNumber
{
    public static void main (String[] args)
    { short card;
      int digit1,digit2,digit3,digit4,digit5;
      Scanner scan = new Scanner (System.in);
      System.out.print ("Enter first four digits of the card number ");
      card = scan.nextShort();
      digit1 = card / 1000 % 10;
      digit2 = card / 100 % 10;
      digit3 = card / 10 % 10;
      digit4 = card % 10;
      digit5 = (digit1 + digit2 + digit4) % 10;
      System.out.println ("The 6 digit card no is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit3);
    }
}
