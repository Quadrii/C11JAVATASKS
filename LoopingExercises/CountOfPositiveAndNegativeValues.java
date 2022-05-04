import java.util.Scanner;
public class CountOfPositiveAndNegativeValues {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int positiveValues = 0;
        int negativeValues = 0;
        int numberCount = 1;
        int zeros = 0;
        while (numberCount <= 10){
            System.out.print("Enter a number: ");
            int result = input.nextInt();
            if (result > 0){
                positiveValues = positiveValues + 1;
            } else if (result < 0) {
                negativeValues = negativeValues + 1;
            }
            else if (result == 0) {
                zeros = zeros + 1;
            }
            numberCount = numberCount + 1;
        }
        System.out.printf("You entered %d%n positive Values ", positiveValues);
        System.out.printf("You entered %d%n negative values", negativeValues);
        System.out.printf("You entered %d%n zeros", zeros);
    }
}
