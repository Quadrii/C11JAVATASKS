public class GasMileage {
        double totalMiles;
        double totalGallons;
        public double getTripMilePerGallon(int miles, int gallons){
            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;

            return miles / gallons;
        }
        public  double getTotalMiles(){
            return totalMiles;
        }
        public double getTotalGallons(){
            return totalGallons;
        }
        public double getTotalMilesPerGallon(){
            return totalMiles / totalGallons;
        }
}
