import java.util.*;
class Palindrome {
    public static void main (String[] args)

    {
        long n, m, a = 0,b=0, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number");
        n = s.nextLong();
        m=n;
        while (n > 0) {
            x = n % 10;
            if(x%2==0)
            {
                b=b+x;
            }
            a = a * 10 + x;
            n = n / 10;
        }
        if (a == m && b>25) {
            System.out.println(+ m+" is palindrome and the sum of even numbers is greater than 25");
        }
        if (a == m && b<25)
        {
            System.out.println(+ m+" is palindrome and the sum of even numbers is less than 25");
        }
        else {
            System.out.println("Given number " + m+" is not palindrome");
        }
    }
}
