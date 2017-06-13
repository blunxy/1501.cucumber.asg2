
/**
 * This class will output a six digit card number
 * Zephaniah Monette
 * Date created Oct. 10, 2016  
 * Last Modified: Oct. 10, 2016- Wrote code and solved errors. Used a double instead of an int
 */

import java.util.Scanner; 
public class NumberGenerator
{
  public static void main(String [] args)
  {
      int card, digit1, digit2, digit3, digit4, digit5;
      System.out.println("Enter the first four digits of the card number.");
      Scanner scan = new Scanner(System.in);
      card = scan.nextInt();
      digit1 = card/1000 % 10;
      digit2 = card/100 % 10;
      digit3 = card/10 % 10;
      digit4 = card % 10; 
      digit5 = (digit1 + digit2 + digit4) % 10;
      System.out.println("The six digit card no is: " + digit1 +digit2 +digit3 +digit4 +digit5+ digit3);
      //I love the Papers Please reference. Its a great game! GLORY TO ARSTOTZKA!
    
}
}
