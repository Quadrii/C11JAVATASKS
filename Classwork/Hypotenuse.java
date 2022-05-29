package Classwork;
import java.util.Scanner;
public class Hypotenuse {
    static double calculateHypotenuse(double side1, double side2){
        double hypoten = Math.pow(side1, side2);
        return hypoten;
    }
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of first side: ");
            double firstSide = input.nextInt();
        System.out.print("Enter the value of second side: ");
            double secondSide = input.nextInt();
            System.out.print("The Hypotenuse of the sides is: " + calculateHypotenuse(firstSide, secondSide));
    }
}
