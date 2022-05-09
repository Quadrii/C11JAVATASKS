import java.util.Scanner;

public class LargestValue {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        LargestSales bestSeller = new LargestSales();
        int unitSold;
        int counter =1;
        while (counter <= 10){
            System.out.print("Enter Unit Sold: ");
            unitSold = input.nextInt();
            counter = counter + 1;
        }
        System.out.printf("The largest sales is %d%n: ", bestSeller.getLargestUnit());
    }
}
