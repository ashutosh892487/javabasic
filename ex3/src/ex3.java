import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ënter a word");
        String word= scan.next();
        word = word.toLowerCase();
        for(int i=0; i<word.length(); i++)
        {
            char ch =word.charAt(i);
            if(ch < 'a' || ch > 'z')
            {
                System.out.println("Error");
                System.exit(0);
            }        }
        for(int i = 0; i < word.length(); ++i)
        {
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.println( ch + " - vowel");
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                System.out.println( ch + " - Consonent");
            }        }
    }
}
