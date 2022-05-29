package Classwork;
import java.util.Arrays;
public class ArrayEqualCheck {
    public static void main(String[] args) {
        String[] record1 = {"school", "field", "course"};
        String[] record2 = {"subjects", "scores", "class"};
        System.out.println(Arrays.equals(record1, record2));

        String[] schoolsAroundVillage = {"unilag", "finbas", "yabatech"};
        String[] schoolsAroundVillage2 = {"unilag", "finbas", "yabatech"};
        System.out.println(Arrays.equals(schoolsAroundVillage, schoolsAroundVillage2));
    }
}
