package OOP.sms;

import java.util.Scanner;

public class StudentMngtSystemMain {
    static School school;
    static Scanner input = new Scanner(System.in);
    private static void dummyData(){
        school.addStudent("Tolu", 21);
        school.addStudent("Yinka", 20);
        school.addStudent("Dee", 19);
        school.addCourse("Maths", "math101");
        school.addCourse("English", "english101");
        school.addCourse("computer", "computer101");
    }

    private static void schoolPortal(){
        int sentinel = 0;
        while (sentinel != -1){
            System.out.println("Enter 1 to register a course");
            System.out.println("Enter 2 to register a new student");
            System.out.println("Enter 3 to View students");
            System.out.println("Enter 0 to quit");
            int response = input.nextInt();
            switch (response){
                case 1:
                    System.out.println("Enter course Name");
                    String courseName =input.next() ;
                    System.out.println("Enter course code");
                    String courseCode = input.next();
                    school.addCourse(courseName, courseCode);
                    break;
                case 2:
                    System.out.println("Enter student name");
                    String studentName = input.next();
                    System.out.println("Enter student age");
                    int studentAge = input.nextInt();
                    school.addStudent(studentName, studentAge);
                    break;
                case 3:
                    school.getStudents();
                case 0:
                    sentinel = -1;
            }
        }
    }
    public static void main(String[] args) {
        school= new School("quadrilateralGroupOfSchool", "Gbagada, Lagos");
        dummyData();
        int sentinel = 0;
        while (sentinel != -1){
            System.out.println("Enter 1 for school portal");
            System.out.println("Enter 2 for student portal");
            System.out.println("Enter 0 to quit");
            int option = input.nextInt();
            switch (option){
                case 1:
                    schoolPortal();
                case 0:
                    sentinel = -1;
            }
        }
    }
}
