package Classwork;
import java.util.Scanner;

public class BestStudentMain {
    public static void main(String[] args) {
        BestStudent hardworking = new BestStudent(3, 3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many student data do you want to enter: ");
        int noOfStudent = scanner.nextInt();
        int counter = 0;
        while (counter < noOfStudent){
            System.out.println("press 1 to enter student name");
            System.out.println("press 2 to enter student name");
            System.out.println("press 3 to check student name");
            System.out.println("press 4 to check student score");
            Scanner input = new Scanner(System.in);
            int studentData = input.nextInt();
            switch (studentData){
                case 1:
                    System.out.println("Enter student name: ");
                    String stdtName = input.next();
                    hardworking.studentName(stdtName);
                case 2:
                    System.out.println("Enter student score: ");
                    int score = input.nextInt();
                    hardworking.studentScore(score);

                case 3:
                    System.out.println("Enter student ID to check student details: ");
                    int number = input.nextInt();
                   String details =  hardworking.getStudentRecord(number);
                    System.out.println("The student name " + details);

                case 4:
                    System.out.println("Enter student ID to check student score");
                    int scoreNumber = input.nextInt();
                    int scoreInfo = hardworking.getStudentResult(scoreNumber);
                    System.out.println("The student score is: " + scoreInfo);
                    System.out.println("************************************************");

            }
            counter++;
        }
        System.out.println("##################################################");
            System.out.println("The Highest Grade is: " + hardworking.highestScore());
        System.out.println("**************************************************");
            System.out.println("The lowest Grade is: " + hardworking.lowestScore());
    }
}
