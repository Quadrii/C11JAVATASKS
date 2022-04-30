package tdd;

public class Kata {
    public int add(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int subtraction(int firstNumber, int secondNumber){
        int subtract = 0;
        if (firstNumber > secondNumber) {
            subtract = firstNumber - secondNumber;
        }
        else if (secondNumber > firstNumber) {
            subtract = secondNumber - firstNumber;
        }
        return subtract;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        int multiply = firstNumber * secondNumber;
        return multiply;
    }

    public int division(int firstNumber, int secondNumber) {
        int divides = 0;
        if (firstNumber == 0 || secondNumber == 0) {
            return divides;
        }
        else {
             divides = firstNumber / secondNumber;
        }
        return divides;
    }

    public String grading(int scored){
        String theGrade = null;
        if (scored <= 60) {
            theGrade = "F";
        }
        if (scored >= 60 && scored <= 70) {
            theGrade = "D";
        }

        if (scored >= 70 && scored <= 80) {
            theGrade = "C";
        }
        if (scored >= 80 && scored <= 90) {
            theGrade = "B";
        }
        if (scored >= 90 && scored <= 100) {
            theGrade = "A";
        }
        return theGrade;
    }
}
