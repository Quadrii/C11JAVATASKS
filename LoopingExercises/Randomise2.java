import java.security.SecureRandom;
import java.util.Scanner;

public class Randomise2 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        SecureRandom generator = new SecureRandom();
        System.out.print("How many questions do you want? ");
        int userResponse = input.nextInt();
        int counter = 0;
        int correctAnswer = 0;
        int wrongAnswer = 0;
        int userAnswer;
        while (userResponse != correctAnswer){
            int number1 = 1 + randomNumbers.nextInt(15);
            int number2 = 1 + randomNumbers.nextInt(15);
            int question = generator.nextInt(4);
            switch (question){
                case 0:
                    System.out.println("What is " + number1 + " + " + number2 + "?");
                    userAnswer = input.nextInt();
                    if ( number1 + number2 == userAnswer){
                        correctAnswer++;
                    }else {
                        wrongAnswer++;
                    }
                    break;
                case 1:
                    System.out.println("What is " + number1 + " - " + number2 + "?");
                    userAnswer = input.nextInt();
                    if ( number1 - number2 == userAnswer){
                        correctAnswer++;
                    }else {
                        wrongAnswer++;
                    }
                    break;
                case 2:
                    System.out.println("What is " + number1 + " * " + number2 + "?");
                    userAnswer = input.nextInt();
                    if ( number1 * number2 == userAnswer){
                        correctAnswer++;
                    }else {
                        wrongAnswer++;
                    }
                    break;

                case 3:
                    System.out.println("What is " + number1 + " / " + number2 + "?");
                    userAnswer = input.nextInt();
                    if ( number1 / number2 == userAnswer){
                        correctAnswer++;
                    }else {
                        wrongAnswer++;
                    }
                    break;
            }
            counter++;
        }
        int checkAnswer = correctAnswer - wrongAnswer;
        System.out.println("correct answer: " +  correctAnswer);
        System.out.println("wrong answer: " + wrongAnswer);
        System.out.printf("Your score is %d%n: ", checkAnswer);
    }
}
