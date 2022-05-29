package Arrays;

public class Example1 {
    public static void main(String[] arg){
        int[] myArray = {1, 3, 4, 778, 32,9};
        for (int i =0; i < myArray.length; i++){
            int randomIndex = (int) (Math.random() * 10);
            try {
                System.out.println("array at random index " + randomIndex + " " + "is " + " " + myArray[randomIndex]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Index encountered");
            }
        }
    }
}

/* for (int row=0; row<array.length; row++){
        for (int column =0; column <array[0].length; column++){
            System.out.print(array[row][column]);
        }
    }
    enter 1 to book a room
    enter 2 to leave a room
    enter 3 to check details of a room
    enter -1 to exit
 */