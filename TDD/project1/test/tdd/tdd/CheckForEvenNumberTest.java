package tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

public class CheckForEvenNumberTest {
    @Test
    public void checkForEvenNumber(){
        EvenNumber theEven = new EvenNumber();
        theEven.checkEven(8);
        assertEquals(true, theEven.isEven());
    }
}
