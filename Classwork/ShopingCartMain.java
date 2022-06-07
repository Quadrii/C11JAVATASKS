package Classwork;

import java.util.Scanner;

public class ShopingCartMain {
    public static void main(String[] args) {
        ShopingCart shopping = new ShopingCart();
        Scanner input = new Scanner(System.in);
        String itemName;
        int quantity;
        int itemPrice;
        int discount;
        String answer = " ";
        System.out.println("Enter customer Name");
        String customerName = input.next();
        shopping.setCustomerName(customerName);
        System.out.println("Enter store name");
        String storeName = input.next();
        shopping.setStoreName(storeName);
        System.out.println("Enter cashier Name");
        String cashierName= input.next();
        shopping.setCashierName(cashierName);

        int count = 0;
        do {
            System.out.println("Enter item Name");
            itemName=input.next();
            shopping.addItemName(itemName, count);
            System.out.println("How many pieces");
            quantity = input.nextInt();
            shopping.addQuantity(quantity, count);
            System.out.println("How much per unit");
            itemPrice = input.nextInt();
            shopping.addItemPrice(itemPrice, count);
            System.out.println("How much discount will he get");
            discount=input.nextInt();
            shopping.setDiscount(discount);
            System.out.println("Do you want to add another item? y/n");
            answer = input.next();
            count++;
        }
        while(answer.equals("y"));
        System.out.println("The total price is: " + shopping.totalPriceForItem(0));
//        System.out.println("The total price is: " + shopping.totalPriceForItem(1));
//        System.out.println("The total price is: " + shopping.totalPriceForItem(2));
//        System.out.println("The total price is: " + shopping.totalPriceForItem(3));
        System.out.println("The discount price will be: " + shopping.calcDiscount(0));
        System.out.println("The final amount to be paid by customer including tax is: " + shopping.amountToBePaid(0));
    }
}
