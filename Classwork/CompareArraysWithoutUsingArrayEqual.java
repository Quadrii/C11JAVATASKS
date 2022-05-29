package Classwork;

public class CompareArraysWithoutUsingArrayEqual {
    public boolean compareTwoArrays(String[] a, String[] b){
        if (a.length != b.length){
            return false;
        }
        for (int i=0; i<a.length; i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
