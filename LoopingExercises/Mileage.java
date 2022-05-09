import java.util.Scanner;
public class Mileage{
    public static void main(String[] arg){
        int miles;
        int gallons;
        String answer = "";
        Scanner input = new Scanner(System.in);
        GasMileage mileage = new GasMileage();
        do {
            System.out.print("Enter the miles: ");
            miles = input.nextInt();
            System.out.print("Enter the gallons used: ");
            gallons = input.nextInt();
            System.out.printf("Your MPG for this trip is %.2f: \n ", mileage.getTripMilePerGallon(miles, gallons));
            System.out.println("Do you want to add another trip? y/n");
            answer = input.next();
        }
        while(answer.equals("y"));
        System.out.println("COMBINE TOTAL MPG");
        System.out.printf("Your total MPG for this trip is %.2f: ", mileage.getTotalMilesPerGallon());
    }
}
