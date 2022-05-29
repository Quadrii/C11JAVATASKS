package Chapter2and3;

public class TriangleAstericks {
    public static void main(String[] args) {
        int[] numberOfAstericks = {1,2,3,4,5,6,7,8,9,10};
        for (int counter = 0; counter < numberOfAstericks.length; counter++){
            for (int stars = 0; stars < numberOfAstericks[counter]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
