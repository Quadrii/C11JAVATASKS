import java.util.Scanner;
public class FactorialNum {
    static int factorial(int n){
        if (n != 0){
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int factorialNum = factorial(num );
        System.out.print("The factorial num is: " + factorialNum);
    }
}
