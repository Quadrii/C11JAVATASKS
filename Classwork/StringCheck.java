package Classwork;

public class StringCheck {
    public static void main(String[] args) {
        String s = "abcdabcdabca";
        int aCount =0;
        for (int i=0; i < s.length(); i++){
            if (s.charAt(i)=='a'){
                aCount++;
            }
        }
        System.out.println(aCount);
    }
}
