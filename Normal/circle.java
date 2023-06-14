package Normal;
import java.util.Scanner;
public class circle {



    public static void main(String[] args) {
        double pi = 3.1416;
       Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = obj.nextInt();
        double ans = pi *r*r;

        System.out.println("The ans is : " +ans);


    }
}
