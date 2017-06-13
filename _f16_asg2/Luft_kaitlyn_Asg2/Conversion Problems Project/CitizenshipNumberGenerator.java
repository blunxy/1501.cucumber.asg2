
/**
* CGenerates Citizenship Card Numbers
* @author Kaitlyn Luft
* Date created: Oct 12, 2016
* Last Modified: Oct 12, 2016 - start
*/
import java.util.Scanner;
public class CitizenshipNumberGenerator
{
   public static void main (String[]args){
       int card, digit1, digit2, digit3, digit4, digit5;
       Scanner input= new Scanner (System.in);
       //write “Enter first four digits of the card number”  
       System.out.println("Enter first four digits if the card number");
       //read card
       card = input.nextInt();
       //set digit1 = card / 1000 % 10
       digit1= card/1000%10;
       //set digit2 = card / 100 % 10
       digit2 = card/100%10; 
       //set digit3 = card / 10 % 10
       digit3 = card/10%10;
       //set digit4 = card % 10
       digit4=card%10;
       //set digit5 = (digit1 + digit2 + digit4) % 10;
       digit5 =(digit1+digit2+digit4)%10;
       //write “The 6 digit card no is ”,digit1,digit2,digit3,digit4,digit5,digit3
       System.out.println("The 6 digit card no. is "+ digit1+digit2+digit3+digit4+digit5+ digit3);
    }
}
