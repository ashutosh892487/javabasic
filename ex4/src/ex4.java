import java.util.*;
class Pattern {
    public static void main(String[] args)
    {
        int Input,startDigit=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Give input");
        Input=s.nextInt();
        for(int i=0;i<Input;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(+startDigit+" ");
            }
            startDigit=startDigit+1;
        }

    }
}
