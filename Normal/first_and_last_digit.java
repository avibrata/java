package loop_problems;
import java.util.Scanner;
public class first_and_last_digit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10)
        {
            firstDigit /= 10;
        }
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
