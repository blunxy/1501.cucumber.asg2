
/**
* Calculates the volume of a sphere
* @ Ergi Thodhori
* Date created: October 3rd 2016
* Last Modified: October 3rd 2016 - Project Started
*/
import java.util.Scanner;
public class SphereVolume{
    public static void main(String[] args) {
        String ans;
        Scanner scan = new Scanner(System.in);
        //set PI = 3.14
        double PI = 3.14, radius, volume;
        //write “Enter the radius of the sphere: ”
        System.out.print("Enter the radius of the sphere:");
        //read radius
        radius = scan.nextInt();
        //set volume = (4/3) * PI * (radius*radius*radius)
        volume = (4.0/3.0)*(PI)*(radius*radius*radius);
        //write “The volume is ”,volume
        System.out.println("The Volume is: " + volume);
    }
}