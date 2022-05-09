//Work In Progress
import java.util.Scanner;
public class DispalyLargestAndSmallestNumber {
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);
        int counter = 2;
        int maximumValue = 0;
        int minimumValue = 0;
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while (counter <= 10){
            number = input.nextInt();
           if (number < minimumValue) {
               minimumValue = number;
           } else if (number > maximumValue){
               maximumValue = number;
           }
            counter = counter + 1;
        }
        System.out.printf("The minimum value is: ", minimumValue);
        System.out.printf("The maximum value is: ", maximumValue);
    }
}
