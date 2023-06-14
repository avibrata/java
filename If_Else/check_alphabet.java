package If_Else;
import java.util.Scanner;
public class check_alphabet {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an character: ");
        char character = scanner.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
        {
            System.out.println(character + " is an alphabet");
        } else
        {
            System.out.println(character + " is not an alphabet");
        }
    }
}
