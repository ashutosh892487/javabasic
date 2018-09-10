import java.util.*;
public class ex10 {
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println("Enter a number: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int l = s.length();
        System.out.print(s);
        for (int i = 1; i <= n; i++) {
            for (int j = l - n; j < l; j++) {
                System.out.print(s.charAt(j));
            }
        }
    }
}
