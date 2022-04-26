package tdd;

public class EvenNumber {
    private boolean num;

    public void checkEven(int checkNumber){
        if (checkNumber % 2 == 0) {
            num = true;
        } else if (checkNumber % 2 != 0) {
            num = false;
        }
    }

    public boolean isEven () {
        return num;
    }
}
