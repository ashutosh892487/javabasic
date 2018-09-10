import java.util.*;
class sortDescend {
    public static void main(String[] args) {
    int num,size=0,i=0,j,temp;
    System.out.println("Enter the number: ");
    Scanner scan= new Scanner(System.in);
    num=scan.nextInt();
    int k=num;
    while(num>0)
    {
        int rem;
        rem=num%10;
        size++;
        num/=10;
    }
    int arr[]=new int[size];;
    while(k>0)
    {
        int rem1;
        rem1=k%10;
        arr[i]=rem1;
        i++;
        k/=10;
    }
    for(i=0;i<size;i++)
    {
        for(j=i+1;j<size;j++)
        {
            if(arr[i]<arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }            }
    }
    int add=0;
    for(i=0;i<size;i++) {
        if(arr[i]%2==0)
        {
            add+=arr[i];
        }
        System.out.print(arr[i]);
    }
    System.out.println("\n Sum of even Numbers : " + add);
    if(add>15)
    {
        System.out.println("True");
    }
    else {
        System.out.println("False");
    }
}
}