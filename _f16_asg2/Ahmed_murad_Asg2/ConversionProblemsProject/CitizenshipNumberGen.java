/**
 * This program will help generate a 6 digit number used on the fellow citizens identification cards. 
 * 
 * @author Murad Ahmed 
 * @version oct 9th, 2016 - start date 
 *         
 */


import java.util.Scanner;

public class CitizenshipNumberGen
{
    public static void main(String[] args)
    {
        int card,digit1,digit2,digit3,digit4,digit5;
        System.out.println("Enter the first four digits of the card number");
        Scanner scan = new Scanner (System.in);
        card = scan.nextInt();
        digit1 = card / 1000 % 10;
        digit2 = card / 100 % 10;
        digit3 = card / 10 % 10;
        digit4 = card % 10;
        digit5= (digit1+digit2+digit4) % 10;
        System.out.println("The 6 digit no is " + digit1+digit2+digit3+digit4+digit5+digit3); 
    }
}

       
        
        
