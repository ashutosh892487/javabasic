import java.util.*;
class NumberGuessing {
    public static void main(String[] args){
        int TargetNumber=85;
        System.out.println("A target number is set between 1 to 100 : ");
        Scanner num=new Scanner(System.in);
        for (int i = 0; i < 99; i++) {
            System.out.println("Guess the number: ");
            int GuessNumber = num.nextInt();
            if (GuessNumber ==TargetNumber ) {
                System.out.println("Number guessed matches the original number.");
                System.exit(0);
            }
            if (GuessNumber > TargetNumber) {
                System.out.println("Number guessed is more than original number.");
            }
            if (GuessNumber < TargetNumber) {
                System.out.println(" Number guessed is less than original number.");
            }
        }
    }
}

