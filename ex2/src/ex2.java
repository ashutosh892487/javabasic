import java.util.*;
class numberCheck {
    public static void main(String[] args)
    {
        int Input;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        Input=s.nextInt();
        if(Input%2==0 && Input>=20 && Input<=30)  //check if number is even.
        {
            System.out.println("Jerry");
        }
        if(Input%2!=0 && Input>=20 && Input<=30)  //check if number is odd.
        {
            System.out.println("Tom");
        }
    }
}
