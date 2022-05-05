import java.util.Scanner;

public class SalesCommissionCalc {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        SalesCommission saleCommission = new SalesCommission();
        int item = 0;
        int counter =0;
        while (item != 9){
            System.out.print("Enter the number (1-4) of the item sold. press 9 to exit the loop: ");
            item = input.nextInt();
            saleCommission.enterItem(item);
            counter = counter + 1;
        }
        if (saleCommission.getSalesPersonEarnings() > 0){
            System.out.print("WEEKLY COMMISSION\n");
            System.out.printf("Your commission for this week is %.2f: ", saleCommission.getSalesPersonEarnings());
        }
    }
}
