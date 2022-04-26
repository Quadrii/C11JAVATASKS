package tdd;

public class MysteryNumber {
    private int guessNumber = 7;

    public void guessMysteryNum(int puzzleNumber){
        boolean guessRight = false;
        if (puzzleNumber == guessNumber) {
            guessRight = true;
        } else if (puzzleNumber != guessNumber) {
            guessRight = false;
        }
    }

    public int getGuessNumber() {
        return  guessNumber;
    }
}
