
/**
 * This program will generate a 6 digit number based on 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CardNumber
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first four digits of card number:");
        int card = input.nextInt();
        int a=card/1000%10, b=card/100%10, c=card/10%10, d=card%10, e=(a+b+d)%10;
        
        System.out.println("The 6 digit number is:" +a+b+c+d+e+c);
        System.out.println("Glory to Arstotzka!");
    }
        }
        
        
       
    
        
   