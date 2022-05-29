package Classwork;

import java.util.Scanner;

public class StudentGradeMain {
    public static void main(String[] args) {
        StudentGrade students = new StudentGrade("", 0);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
            String name = input.next();
            students.setName(name);
        System.out.print("Enter student average score: ");
            int averageSCore = input.nextInt();
            students.setAverage(averageSCore);
        System.out.printf("student name is %s and the average is %d the letter grade is %s",
                students.getName(), students.getAverage(), students.getLetterGrade());
    }

}
