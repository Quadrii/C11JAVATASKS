package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MysteryNumberTest {
    @Test
    public void checkMystery(){
        MysteryNumber theMysteryNumber = new MysteryNumber();
        theMysteryNumber.guessMysteryNum(7);
        assertEquals(7, theMysteryNumber.getGuessNumber());
    }
}
