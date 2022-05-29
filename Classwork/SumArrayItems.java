package Classwork;

public class SumArrayItems {
    public static void main(String[] arg){
        int[] arrayItems = {10, 20, 33, -6, -7};
        int total=0;
        int max=arrayItems[0];
        int min=arrayItems[0];
        int average = 0;
        for (int i=0; i< arrayItems.length; i++){
            //Sum the item in the array
            total = total + arrayItems[i];
            //Get the maximum number in the array
            if (arrayItems[i] > max){
                max = arrayItems[i];
            }
            //Get the minimum number in the array
            if (arrayItems[i] < min){
                min = arrayItems[i];
            }
            //Get the average of the item in the array
            average = total/arrayItems.length;
        }
        System.out.println("The sum of the item in the array is: " + total);
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        System.out.println("The average is " + average);
    }

}
