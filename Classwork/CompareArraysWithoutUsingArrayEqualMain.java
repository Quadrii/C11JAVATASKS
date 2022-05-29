package Classwork;

public class CompareArraysWithoutUsingArrayEqualMain {
    public static void main(String[] args) {
        CompareArraysWithoutUsingArrayEqual compareArrays = new CompareArraysWithoutUsingArrayEqual();
        String[] record1 = {"school", "field", "course"};
        String[] record2 = {"subjects", "scores", "class"};

        String[] schoolsAroundVillage = {"unilag", "finbas", "yabatech"};
        String[] schoolsAroundVillage2 = {"unilag", "finbas", "yabatech"};
        System.out.println("These arrays are equals: " + compareArrays.compareTwoArrays(record1, record2));
        System.out.println("These arrays are equals: " + compareArrays.compareTwoArrays(schoolsAroundVillage2, schoolsAroundVillage));

    }
}
