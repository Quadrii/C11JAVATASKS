import java.util.Scanner;
public class ContinueOrStop {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int firstNum;
        int secondNum;
        int sumOfNumbersEntered = 0;
        String answer = "";
        do {
            System.out.print("Enter first number: ");
                firstNum = input.nextInt();
            System.out.print("Enter second number: ");
                secondNum = input.nextInt();
                sumOfNumbersEntered = secondNum + firstNum;
            System.out.printf("The sum of the numbers entered is %d%n ", sumOfNumbersEntered);
            System.out.println("Do you wish to continue? y/n ? ");
                answer=scan.next();
        }while(answer.equals("y"));
    }
}
