public class RightTrianglePattern {
    public static void  main(String[] arg){
        int i;
        int j;
        int row = 10;
        for (i = 0; i<= row; i++){
            for (j =0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


