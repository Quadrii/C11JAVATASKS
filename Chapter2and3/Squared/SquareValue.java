package Chapter2and3.Squared;

import java.util.Scanner;

public class SquareValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberInputs = input.nextInt();
        int squared = numberInputs * numberInputs;
         if (squared == 100){
            System.out.print("WOW, your suqared is 100");
        }
        if (squared < 100){
            System.out.println("Sad!, your suqared is less than 100");
        }
         if (squared > 100){
            System.out.print("Nah, your suqared is greater than 100");
        }

    }
}
