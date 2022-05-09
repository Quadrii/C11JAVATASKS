import java.util.Scanner;
public class TaxCalc {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        TaxCalculator myTaxRate = new TaxCalculator();
        int earnings = 0;
        int counter = 1;
        while (counter <= 3){
            System.out.print("How much do you earn? ");
            earnings = input.nextInt();
            System.out.printf("Your tax rate is %.2f \n ", myTaxRate.getTaxRate(earnings));
            counter = counter + 1;
        }
    }
}
