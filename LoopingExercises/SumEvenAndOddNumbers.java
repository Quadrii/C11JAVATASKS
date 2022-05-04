import java.util.Scanner;
public class SumEvenAndOddNumbers {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int evenNumbers = 0;
        int oddNumbers = 0;
        int totalOdd = 0;
        int totalEven = 0;
        int numberCount =1;
        while (numberCount <= 10){
            System.out.print("Enter a number: ");
            int enteredNumber = input.nextInt();
            if (enteredNumber % 2 == 0 ) {
                totalEven = totalEven + enteredNumber;
                evenNumbers = evenNumbers + 1;
            } else if (enteredNumber % 2 != 0) {
                totalOdd =  totalOdd + enteredNumber;
                oddNumbers = oddNumbers + 1;
            }
            numberCount = numberCount + 1;
        }
        System.out.printf("You entered %d%n even Numbers. ", evenNumbers);
        System.out.printf("The sum of the even Numbers is %d%n. ", totalEven);
        System.out.printf("You entered %d%n Odd Numbers. ", oddNumbers);
        System.out.printf("The sum of the Odd Numbers is %d%n. ", totalOdd);
    }
}
