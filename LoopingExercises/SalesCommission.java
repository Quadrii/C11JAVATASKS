public class SalesCommission {
    double weeklyWages = 200.0;
    double commission = 0.09;
    double itemSold;

    double salesPersonEarnings;
    public void enterItem(int item){
        switch (item){
            case 1:
            itemSold += 239.99;
            break;
            case 2:
                itemSold += 129.75;
                break;
            case 3:
                itemSold += 99.95;
                break;
            case 4:
                itemSold += 350.89;
                break;
            default:
                break;
        }
    }
    public  double getSalesTotal(){
        return itemSold;
    }


    public double getSalesPersonEarnings(){
        return weeklyWages + itemSold * commission;
    }
}
