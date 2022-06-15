import java.util.Scanner;

public class StudentResult {
    public static String studentResultCheck(int result){
        if (result == 1){
            return "The student passed";
        } else if (result == 2) {
            return "The student failed";
        }
        return "No result for this student";
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName = null;
        int studentResult;
        int counter = 0;
        int passedStudent = 0;
        int failedStudent = 0;
        System.out.println("press 1 to enter student result: ");
        System.out.println("press -1 to quit:  ");
        int userResponse = input.nextInt();
        while (counter < 10){
            switch (userResponse){
                case 1:
                    System.out.println("Enter student name: ");
                        String name = input.next();
                        studentName = name;
                case 2:
                    System.out.println("Enter student results: ");
                        int result = input.nextInt();
                        if (result == 1){
                            passedStudent = passedStudent + 1;
                        } else if (result == 2) {
                            failedStudent = failedStudent + 1;
                        }
                    studentResult = result;

                    System.out.println("####################################################");
                    System.out.println("The student name is: " + studentName);
                    System.out.println("The student Result is: " + studentResultCheck(studentResult));
            }
            counter++;
        }
        if (passedStudent >= 8){
            System.out.println("Bonus to instructor");
        }
        System.out.println("The number of passed student is: " + passedStudent);
        System.out.println("The number of failed student is: " + failedStudent);
    }
}
