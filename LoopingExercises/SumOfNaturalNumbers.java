import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int countNumber = 1;
        while (countNumber <= 10) {
            System.out.print("Enter a number: ");
            int naturalNumbers = input.nextInt();
            sum = sum + naturalNumbers;
            countNumber = countNumber + 1;
        }
        System.out.printf("The sum of the Natural numbers entered is %d%n", sum);
    }
}
