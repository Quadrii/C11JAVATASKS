//Work In Progress
import java.util.Scanner;
public class ContinueOrStop {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        char cont= 'y';
        int firstNum;
        int secondNum;
        int sumOfNumbersEntered = 0;
        while (cont !='n'){
            System.out.print("Enter first number: ");
            firstNum = input.nextInt();
            System.out.print("Enter second number: ");
            secondNum = input.nextInt();
            sumOfNumbersEntered = secondNum + firstNum;
            System.out.print("Do you wish to continue? y/n ?");
            cont = input.next().charAt(0);
        }
        System.out.printf("The sum of the number entered is %d%n ", sumOfNumbersEntered);
    }
}
