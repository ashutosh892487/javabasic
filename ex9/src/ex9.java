import java.util.*;
public class ex9 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner stg = new Scanner(System.in);
        String word= stg.next();
        System.out.println(reverseString(word));
    }
    public static String reverseString(String s) {
        char c[] = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return new String(c);
    }
}
