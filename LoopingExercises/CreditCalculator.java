import java.awt.*;
import java.util.Scanner;
public class CreditCalculator {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        CreditLimitCalculator creditCalc = new CreditLimitCalculator();
        int accountNo;
        int startBalance;
        int creditLimit;
        int charges;
        char cont = 'y';
        while (cont != 'n') {
            System.out.print("Enter customer account number: ");
                accountNo = input.nextInt();
            System.out.print("Enter customer balance at start: ");
                startBalance = input.nextInt();
            System.out.print("Enter customer creditLimit: ");
                creditLimit = input.nextInt();
            System.out.print("Enter customer charges: ");
                charges = input.nextInt();


             System.out.printf("Customer account Number is %d%n: ", accountNo);
            System.out.printf("Customer start balance is %d%n: ", startBalance);
            System.out.printf("Customer credit limit is %d%n: ", creditLimit);
            System.out.printf("Customer charges %d%n: ", charges);

            if (creditCalc.creditExceeded()){
                System.out.print("Credit limit exceeded");
            }
        }

    }
}
