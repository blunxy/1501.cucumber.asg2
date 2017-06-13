
/**
* This program automaticly generates a citizens citizenship number
* @author: Ergi Thodhori
* Date created: October 4th, 2016
* Last Modified: Date of modification: October 4th, 2016
*/

import java.util.Scanner;
public class CitizenshipNumber
{
  public static void main(String[] args)
  {
      int card;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first four digits of the card number: ");
      card = input.nextInt();
      double digit1 = card/ 1000%10;
      double digit2 = card / 100%10;
      double digit3 = card / 10%10;
      double digit4 = card%10;
      double digit5 = (digit1+digit2+digit4)%10;
      System.out.print("The 6 digit card number is: " + digit1);
      System.out.print(digit2);
      System.out.print(digit3);
      System.out.print(digit4);
      System.out.print(digit5);
      System.out.print(digit3);
    }
}
