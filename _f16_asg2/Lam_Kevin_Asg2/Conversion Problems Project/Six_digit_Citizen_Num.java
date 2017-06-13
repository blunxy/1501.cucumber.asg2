
/**
 * Write a description of class Six_digit_Citizen_Num here.
 * This program is meant to generate a six digit citizenship number
 * @author (Kevin Lam) 
 * @version (October 11, 2016)
 */
import java.util.Scanner;
public class Six_digit_Citizen_Num
{ public static void main (String [] args) { int card;
    Scanner input = new Scanner(System.in);
    System.out.println ("Enter first four digits of the card number ");
    card = input.nextInt ();
    int digit1 = card / 1000 % 10;
    int digit2 = card / 100 % 10;
    int digit3 = card /10 % 10;
    int digit4 = card % 10;
    int digit5 = (digit1 + digit2 + digit4) % 10;
    System.out.println ("The 6 digit card no is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit3);
    
    
    
    
    
}
    
}
