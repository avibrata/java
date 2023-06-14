package fundamentals;
import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();

        double interest = principal* (Math.pow((1 + rate / 100), time));

        System.out.println("\nThe compound interest is " + interest);
    }
}
