import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int firstInteger = input.nextInt();

        System.out.print("Enter a number: ");
        int secondInteger = input.nextInt();

        System.out.print("Enter a number: ");
        int thirdInteger = input.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        int average = sum / 3;
        int multiplication = firstInteger * secondInteger * thirdInteger;

        System.out.printf("The sum is %d%n, the average is %d%n and the multiplication is %d%n", sum, average, multiplication);

    }
}
