package Chapter2and3.SqaureAddSub;

import java.util.Scanner;

public class SquareCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputOne = input.nextInt();
        int inputOneSquare = inputOne * inputOne;

        System.out.print("Enter second Number :");
        int inputTwo = input.nextInt();
        int inputTwoSquare = inputTwo * inputTwo;

        int squareAddition = inputOneSquare + inputTwoSquare;
        int squareSubtraction = inputOneSquare - inputTwoSquare;

        System.out.printf("The square addition is %d%n and the subtraction is %d%n", squareAddition, squareSubtraction );
    }
}
