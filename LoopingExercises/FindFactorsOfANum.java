import java.util.Scanner;

public class FindFactorsOfANum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int theNum = input.nextInt();
        for (int i =theNum; i > 0; i--){
            if (theNum % i == 0){
                System.out.println(i + " " + "is a factor of " + theNum);
            }
            else {
                System.out.println(i + " " + "is not a factor of " + theNum);
            }
        }
    }
}
