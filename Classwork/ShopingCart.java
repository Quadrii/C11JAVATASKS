package Classwork;

public class ShopingCart {
    private int[] quantity=new int[4];
    private String[] itemName=new String[4];
    private String customerName;
    private int discount;
    private final double  VAT = 0.175;
    private String cashierName;
    private int[] itemPrice=new int[4];
    private String storeName;

    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }
    public void addItemName(String itemName, int index) {
        this.itemName[index] = itemName;
    }

    public void addItemPrice(int itemPrice, int index) {
        this.itemPrice[index] = itemPrice;
    }

    public String[] getItemName() {
        return itemName;
    }

    public void addQuantity(int quantity, int index) {
        this.quantity[index] = quantity;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int totalPriceForItem(int index){
        int totalItemPrice=0;
        for (int i=0; i<itemName.length;i++){
            totalItemPrice = itemPrice[index] * quantity[index];
        }
        return totalItemPrice;
    }

    public double calcDiscount(int index){
        int discountOnItem=0;
        int divideDiscount = 0;
        for (int i=0; i< itemName.length; i++){
            divideDiscount = totalPriceForItem(index) * discount/100;
            discountOnItem = totalPriceForItem(index) - divideDiscount;
        }
        return discountOnItem;
    }

    public double amountToBePaid(int index){
        double finalAmountPaid = 0;
        double calcVat;
        for (int i=0; i<itemName.length;i++){
            calcVat = calcDiscount(index) *  VAT;
            finalAmountPaid = calcDiscount(index) + calcVat;
        }
        return finalAmountPaid;
    }
//    public int amountSpentByCustomer(){
//        int amountCustomerSpent = 0;
//        amountCustomerSpent =amountCustomerSpent + totalPriceForItem();
//        return amountCustomerSpent;
//    }
}
