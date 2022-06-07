package Classwork;
import java.util.Scanner;
public class StudentDataMain {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        Scanner input = new Scanner(System.in);
        System.out.println("How many student do you have? ");
            int studentNum = input.nextInt();
            String[] studentName=new String[studentNum];
            int[] totalScores= new int[studentNum];
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
                System.out.printf("Enter %s\'s score  in  %s: ", studentName[i], studentSubjects[j]);
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
        for (int j  =0; j < studentName.length; j++){
            for (int i=0; i<studentScore.length; i++){
                System.out.println(studentScore[j][i]);
            }
            System.out.println();
        }



        System.out.println("The total score for " + studentName[0] +" " + "is " + " "+ studentData.totalScore(0));
        System.out.println("The total score for " + studentName[1] +" " + "is" + " "+ studentData.totalScore(1));
        System.out.println("The total score for " + studentName[2] +" " + "is" + " "+ studentData.totalScore(2));

        System.out.println("The average score for " + studentName[0] + " " + "is" + " " + studentData.averageScore(0));
        System.out.println("The average score for " + studentName[1] + " " + "is" + " " + studentData.averageScore(1));
        System.out.println("The average score for " + studentName[2] + " " + "is" + " " + studentData.averageScore(2));

        System.out.println("The total score for " + studentSubjects[0] + " " + "is" + " " + studentData.subjectScores(0));
        System.out.println("The total score for " + studentSubjects[1] + " " + "is" + " " + studentData.subjectScores(1));
        System.out.println("The total score for " + studentSubjects[2] + " " + "is" + " " + studentData.subjectScores(2));

    }
}
