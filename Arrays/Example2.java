package Arrays;

public class Example2 {
    public static void main(String[] arg){
        int[] array ={2,3,5,6,1,4,10,12};
        int result = 0;
        for (int i=0; i < array.length; i++){
           array[i] = 2 + 2 * i;
        }
        for (int i=0; i<array.length; i++){
            System.out.printf("%d ",  array[i]);
        }
    }
}
