package Classwork;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = null;
        String[] questions = {"How are you? ", "What is your state? ", "What School did you attend? ",
                "what's your discipline? ", "what's your CGPA? ", "Are you currently working? "};
        System.out.println("Onboarding");
        for (String ibeere:questions){
            do {
                System.out.println( ibeere);
                answer = input.next();
            }while (questions.length<0);
            System.out.println(answer);
        }
    }
}
