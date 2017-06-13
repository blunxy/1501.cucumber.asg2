
/**
 * This program generates a valid 6-digit citizenship number
 * Sam Young
 * October 9th 2016 
 * last Modified:
 */
import java.util.Scanner;

public class CitNum
{
    
    public static void main(String [ ] args) 
    {
        Scanner input = new Scanner(System.in);
        int digit1,digit2,digit3,digit4,digit5;
        int card=0;  
        System.out.println ("Enter first four digits of the card number: ");
        card = input.nextInt();
        digit1 = card / 1000 % 10;
        digit2 = card / 100 % 10;
        digit3 = card / 10 % 10;
        digit4 = card % 10;
        digit5 = (digit1 + digit2 +digit4) % 10;
        System.out.println ("The 6 digit card no is: " + digit1+digit2+digit3+digit4+digit5+digit3);
      
    }
}
