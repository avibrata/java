package fundamentals;
import java.util.Scanner;
public class interestCalculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(" principal amount: ");
        double principal = input.nextDouble();

        System.out.print(" rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("enter the period (in years): ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("\nThe simple interest is " + interest);
    }
}
