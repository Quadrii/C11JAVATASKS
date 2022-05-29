package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MysteryNumberTest {
    @Test
    public void checkMystery(){
        MysteryNumber theMysteryNumber = new MysteryNumber();
        theMysteryNumber.guessMysteryNum(7);
        assertEquals(7, theMysteryNumber.getGuessNumber());
    }
}
