import java.util.Scanner;
import java.security.SecureRandom;
public class RandomNumber {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        int counter = 0;
        int generateRandomNumber = 1 + randomNumbers.nextInt(10);
        System.out.print("guess the random number: ");
        int randomNum = input.nextInt();
        while (randomNum != generateRandomNumber){
            if (randomNum > generateRandomNumber){
                System.out.print("Too high, please try again: ");
                randomNum = input.nextInt();
            } else if (randomNum < generateRandomNumber) {
                System.out.print("Too low, please try again: ");
                randomNum = input.nextInt();
            }
            counter = counter + 1;
        }
        System.out.print("Congratulations, you guessed correctly");
    }
}
