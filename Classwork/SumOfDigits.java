package Classwork;

import java.util.Scanner;
public class SumOfDigits {
    static int sumDgts(int n) {
        int divideDigits;
        int result = 0;
        while(n > 0) {
            divideDigits = n % 10;
            result = result + divideDigits;
            n = n / 10;

        }

        return result;
    }
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 digits numbers: ");
        int digits = input.nextInt();
        System.out.print(digits);
        System.out.print("The sum of the digits is " + sumDgts(digits) );
    }

}
