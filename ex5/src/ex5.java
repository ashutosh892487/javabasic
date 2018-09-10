import java.util.*;
class AddIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int total = 0;
        System.out.println("Enter integers with end input as 0:");
        int number = input.nextInt();

        if (number <0) {
            System.out.println("Nigative numbers are entered");
            System.exit(1);
        }

        while (number != 0) {
            if (number > 0)
            total += number;
            count++;
            number = input.nextInt();
        }
        System.out.println("The total is "+total);
    }
}