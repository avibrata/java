package Normal;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = obj.nextInt();
        System.out.println("Enter second number: ");
        int b = obj.nextInt();
        int c = a+b;
        System.out.println("OUTPUT IS :" +c );
    }
}
