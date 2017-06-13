
/**
 * Write a description of class DoomsdayDevice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DoomsdayDevice

{public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        final double PI=3.14;
        final double Red=1.00;
        final double Yellow=0.75;
        final double Green=0.32;
        System.out.println("Welcome to the doomsday device cost estimator");
        System.out.println("Enter the length of the rectangle in centimetres:");
        double recLength=input.nextDouble();
        System.out.println("Enter the height of the rectangle in centimetres:");
        double recHeight=input.nextDouble();
        double areaRec=recLength*recHeight;
        double areaCircle=(PI/4)*(recLength*recLength);
        double areaSquare=recLength*recLength;
        double costRec=areaRec*Green;
        double costCircle=areaCircle*Yellow;
        double costSquare=areaSquare*Red;
        double costDevice=costRec+costCircle+costSquare;
        System.out.print("The area of the green grass is "+areaRec);
        System.out.println(" at a cost of $"+costRec);
        System.out.print("The area of the yellow goop is "+areaCircle);
        System.out.println(" at a cost of $" +costCircle);
        System.out.print("The area of the red ants is "+areaSquare);
        System.out.println(" at a cost of $"+costSquare);
        System.out.print("The total cost of the device is $"+costDevice);
        
    }
        
    
    }

/*write “Welcome to the doomsday device cost estimator”
set PI = 3.14
write “Enter length of rectangle in centimetres:”
read recLength
write “Enter height of rectangle in centimetres:”
read recHeight
set areaRec = recLength*recHeight
set areaCircle = (PI/4)*(recLength*recLength)
set areaSquare = recLength*recLength
set costRec = areaRec*0.32
set costCircle = areaCircle*0.75
set costSquare = areaSquare*1.00
set costDevice = costRec+costCircle+costSquare
write “The area of the green grass is ”,areaRec “ at a cost of ”,costRec
write “The area of the yellow goop is ”,areaCircle “ at a cost of ”,costCircle
write “The area of the red ants is ”,areaSquare “ at a cost of ”,costSquare
write “The total cost of the device is:”,costDevice
*/
