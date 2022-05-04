import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int temp;
        boolean isPrime = true;
        int number = input.nextInt();

        for (int i=2; i<= number/2; i++) {
            temp = number % i;
            if (temp == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.print(number + " is a prime number");
        }else {
            System.out.print(number + " is not a prime number");
        }
    }
}
