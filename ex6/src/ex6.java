import java.util.*;
public class ex6{
    static void charCheck(char input_char)
    {
        // CHECKING FOR ALPHABET
        if ((input_char >= 65 && input_char <= 90))
            System.out.println ( " Uppercase Alphabet ");
        else if ((input_char >= 97 && input_char <= 122))
            System.out.println ( " Lowercase Alphabet ");
            // CHECKING FOR DIGITS
        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Digit ");

            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println ( " Special Character ");
    }

    // Driver Code
    public static void main (String[] args)
    {
        char input_char;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your input");
        input_char= s.next().charAt(0);
        charCheck(input_char);

    }
}

