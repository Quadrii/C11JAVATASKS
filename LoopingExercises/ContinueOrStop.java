//Work In Progress
import java.util.Scanner;
public class ContinueOrStop {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int sumOfNumbersEntered = 0;
        while (counter <= 2){
            System.out.print("Enter a number: ");
            int twoNumbers = input.nextInt();
            sumOfNumbersEntered = sumOfNumbersEntered + twoNumbers;
            counter = counter + 1;
        }
        System.out.printf("The sum of the number entered is %d%n ", sumOfNumbersEntered);
    }
}
