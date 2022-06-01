package Classwork;
import java.util.Scanner;
public class StudentDataMain {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        Scanner input = new Scanner(System.in);
        System.out.println("How many student do you have? ");
            int studentNum = input.nextInt();
            String[] studentName=new String[studentNum];
        System.out.println("How many subjects do they offer? ");
            int studentSubj = input.nextInt();
            String[] studentSubjects=new String[studentSubj];
        int[][] studentScore = new int[studentNum][studentSubj];

        for (int i=0; i < studentNum; i++){
            System.out.printf("Enter student%d Name: ", i+1 );
            studentName[i]= input.next();
            studentData.setName(studentName);
        }

        for (int j=0; j < studentSubjects.length; j++){
            System.out.printf("Enter subject%d Name: ", j+1);
            studentSubjects[j]= input.next();
            studentData.setSubjects(studentSubjects);
        }

        for (int i=0; i <studentName.length; i++){
            for (int j=0; j<studentSubjects.length;j++){
                System.out.printf("Enter %s\'s score  in  %s: ", studentName[i], studentSubjects[i]);
                studentScore[i][j]= input.nextInt();
                studentData.setGrades(studentScore);
            }
        }

        System.out.println("The names are ");
        for (int i=0; i < studentNum; i++){
            System.out.println(studentName[i]);
        }
        System.out.println("The subjects are ");
        for (int j  =0; j < studentSubjects.length; j++){
            System.out.println(studentSubjects[j]);
        }
        System.out.println("The scores are ");
        for (int j  =0; j < studentScore.length; j++){
            for (int i=0; i<studentName.length; i++){
                System.out.println(studentScore[i][j]);
            }
            System.out.println();
        }
    }
}
