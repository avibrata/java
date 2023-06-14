package fundamentals;
import java.util.Scanner;
public class LengthConversion {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in centimeters :");
        double centimeters = input.nextDouble();
        double meters = centimeters/100.0;
        double kilometers = meters/1000.0;
        System.out.println("The length in meters is: " + meters);
        System.out.println("The length in kilometers is: " + kilometers);
    }
}
