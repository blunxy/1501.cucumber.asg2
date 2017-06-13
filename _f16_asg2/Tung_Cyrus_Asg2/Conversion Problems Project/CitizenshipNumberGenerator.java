/**
* This program calculates the area and estimated total cost of a doomsday device. 
* @author Cyrus Tung
* Date created: October 12, 2016 
* Last Modified: October 12, 2016 - finished the program and added in comment header
*/

import java.util.*;
public class CitizenshipNumberGenerator
{
    public static void main (String Args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int card = 0;
        int digit1, digit2, digit3, digit4, digit5 = 0;
        
        System.out.println("Enter first four digits of card number: ");
        card = keyboard.nextInt();
        
        digit1 = card / 1000 % 10;
        digit2 = card / 100 % 10;
        digit3 = card / 10 % 10;
        digit4 = card % 10; 
        digit5 = (digit1 + digit2 + digit4) % 10;
        
        System.out.print("The 6 digit card no is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit3); 
        
        
    }
}