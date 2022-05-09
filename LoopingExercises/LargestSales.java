public class LargestSales {
    private int unitSold;
    private int largest = 0;
    private int largestValue;
    public int getLargestUnit(){
        if (unitSold > largest){
            largestValue = unitSold;
        }
        return largestValue;
    }
}
