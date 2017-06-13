import java.util.Scanner;
public class DoomsdayDeviceCostEstimator 
{
    public static void main (String[] args)
    {
        double radius, area_Green_Grass, area_Yellow_Goop,Total_Cost,Yellow_Square_Foot_Price, Green_Square_Foot_Price, Red_Square_Foot_Price,area_Red_Ant, green_Height, green_Length;
        final double green_SQFT = 0.32, yellow_SQFT = 0.75, red_SQFT = 1.00, PI = 3.14;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Welcome to the doomsday device cost estimator");
        System.out.print ("Enter the length of the green rectangle (in centimeters): ");
        green_Length = scan.nextDouble();
        System.out.print ("Enter the height of the green rectangle (in centimeters): ");
        green_Height = scan.nextDouble();
        area_Green_Grass = green_Length * green_Height;
        Green_Square_Foot_Price = area_Green_Grass * green_SQFT;
        radius = (green_Length)/2;
        area_Yellow_Goop = PI * (radius * radius);
        Yellow_Square_Foot_Price = area_Yellow_Goop * yellow_SQFT;
        area_Red_Ant = (green_Length)*(green_Length);
        Red_Square_Foot_Price = area_Red_Ant * red_SQFT;
        System.out.println ("The area of the green grass is " + area_Green_Grass + " at a cost of $" +  Green_Square_Foot_Price);
        System.out.println ("The area of the yellow goop is " + area_Yellow_Goop + " at a cost of $" + Yellow_Square_Foot_Price);
        System.out.println ("The area of the red ants is " + area_Red_Ant + " at a cost of $" + Red_Square_Foot_Price);
        Total_Cost = Green_Square_Foot_Price + Yellow_Square_Foot_Price + Red_Square_Foot_Price;
        System.out.println ("Total cost of the device is $" + Total_Cost);
    }
}
