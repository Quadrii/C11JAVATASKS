public class TaxCalculator {
    private double taxRate = 0.15;
    private double taxRate2 = 0.20;
    private double totalTax;

    public double getTaxRate(int earnings){
        if (earnings <= 30_000){
            totalTax = taxRate * earnings;
        } else if (earnings > 30_000) {
            totalTax = taxRate2 * earnings;
        }
        return totalTax;
    }
}
