package fundamentals;
import java.util.Scanner;
public class inputOutput {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numInt = input.nextInt();
        System.out.print("Enter a float: ");
        float numFloat = input.nextFloat();
        System.out.print("Enter a double: ");
        double numDouble = input.nextDouble();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.print("Enter a string: ");
        String str = input.next();

        System.out.println("\nInteger: " + numInt);
        System.out.println("Float: " + numFloat);
        System.out.println("Double: " + numDouble);
        System.out.println("Character: " + ch);
        System.out.println("String: " + str);
        input.close();
    }
}
