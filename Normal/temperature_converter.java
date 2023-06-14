package fundamentals;
import java.util.Scanner;
public class temperature_converter {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp in celcius:");
        double celcius = input.nextDouble();
        double farenheit = (celcius*9/5)+32;
        System.out.println("The temp in Farenheit is :" + farenheit);
    }
}
