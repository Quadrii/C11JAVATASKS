import java.util.Scanner;

public class LargestValue {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        int counter =1;
        while (counter <= 10){
            System.out.print("Enter Unit Sold: ");
            int unitSold = input.nextInt();
            counter = counter + 1;
            if (unitSold > largestNumber){
                largestNumber = unitSold;
            }
        }
        System.out.printf("The largest sales is %d%n: ", largestNumber);
    }
}
