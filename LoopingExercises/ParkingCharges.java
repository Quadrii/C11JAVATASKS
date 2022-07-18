import java.util.Scanner;
public class ParkingCharges {
    public static double chargesToBePaid(int hourly){
       final double parkChargesForThreeHours = 2.00;
       final double additionalHourCharges = 0.50;
        double payment = 0;
        if (hourly <= 3){
            payment = parkChargesForThreeHours;
        } else {
            int calcExtraHours;
            calcExtraHours = hourly - 3;
            payment = (additionalHourCharges * calcExtraHours) + parkChargesForThreeHours;
        }
        return payment;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("How many customers parked here yesterday: ");
        int noOfCustomers = input.nextInt();
        while (count < noOfCustomers){
            System.out.println("Enter name of customer");
             String customerName = input.next();
            System.out.println("Enter hours parked");
                int hoursParked = input.nextInt();
            System.out.println( "Hello " +  customerName + "You will pay " + chargesToBePaid(hoursParked) + " " + "parking here yesterday" );
            count++;
        }
    }
}
