import java.util.Scanner;
public class DispalyLargestAndSmallestNumber {
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int maximumValue = 0;
        int minimumValue = 0;
        while (counter <= 10){
            System.out.print("Enter number");
            int number = input.nextInt();
            counter = counter + 1;
           if (number < minimumValue) {
               minimumValue = number;
           } else if (number > maximumValue){
               maximumValue = number;
           }

        }
        System.out.printf("The minimum value is %d%n: ", minimumValue);
        System.out.printf("The maximum value is %d%n: ", maximumValue);
    }
}
