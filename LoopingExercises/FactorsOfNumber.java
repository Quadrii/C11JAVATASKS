import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i=1; i <= num; i++){
            if (num % i == 0){
                System.out.printf("the factors of %d%n are %d%n: ", num, i);
            }
        }
    }
}
