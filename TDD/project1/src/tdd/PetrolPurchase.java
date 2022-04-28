package tdd;


public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double pricePerLiter;
    private double netPurchaseAmount;
    private double discounts;


    public String getStationLocation() {
        return stationLocation;
    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }
    public  String getPetrolType(){
        return petrolType;
    }

    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }

    public int getPetrolQuantity(){
        return petrolQuantity;
    }
    public void setPetrolQuantity(int petrolQuantity){
        this.petrolQuantity = petrolQuantity;
    }

    public double getPricePerLiter(){
        return pricePerLiter;
    }

    public void setPricePerLiter(int pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }

    public void setDiscounts (double discounts){
        this.discounts = discounts;
    }

    public double getDiscounts(){
        return discounts;
    }

    public double getNetPurchaseAMount(){
        double totalPrice;
        totalPrice = petrolQuantity * pricePerLiter;
        netPurchaseAmount = totalPrice - discounts * pricePerLiter;
        return  netPurchaseAmount;
    }
}
