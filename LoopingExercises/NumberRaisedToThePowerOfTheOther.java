import java.util.Scanner;
public class NumberRaisedToThePowerOfTheOther {
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the power number: ");
        int secondNumber = input.nextInt();
        int power = 1;
        if (secondNumber >= 1){
            for (int i = 1; i <= secondNumber; i++){
                power = power * firstNumber;
            }
        }
        System.out.print(power);
    }
}
