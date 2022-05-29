package Arrays;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] itemPrice = new double[10];
        double max = itemPrice[0];
        System.out.println("Enter "  + itemPrice.length + " " + "values ");
        for (int i=0; i < itemPrice.length; i++){
            itemPrice[i] = input.nextDouble();
        }
        for (int i=0; i < itemPrice.length; i++){
            if (itemPrice[i] > max){
                max = itemPrice[i];
            }
        }
        System.out.println( max);
    }
}
