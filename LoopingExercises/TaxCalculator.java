public class TaxCalculator {
    private double taxRate = 0.15;
    private double excessCeiling = 0.20;
    private double totalTax;

    public double getTaxRate(int earnings){
        if (earnings <= 30_000){
            totalTax = taxRate * earnings;
        } else if (earnings > 30_000) {
            totalTax = excessCeiling * earnings;
        }
        return totalTax;
    }
}
