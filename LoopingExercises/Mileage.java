import java.util.Scanner;
public class Mileage{
    public static void main(String[] arg){
        int miles;
        int gallons;
        char cont = 'y';
        Scanner input = new Scanner(System.in);
        GasMileage mileage = new GasMileage();
        while (cont != 'n'){
            System.out.print("Enter the miles: ");
                miles = input.nextInt();
            System.out.print("Enter the gallons used: ");
                gallons = input.nextInt();
            System.out.printf("Your MPG for this trip is %.2f: ", mileage.getTripMilePerGallon(miles, gallons));
            System.out.print("Do you want to add another trip? y/n");
            cont = input.next().charAt(0);
        }
        System.out.println("COMBINE TOTAL MPG");
        System.out.printf("Your total MPG for this trip is %.2f: ", mileage.getTotalMilesPerGallon());
    }
}
