package tdd;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class SetTest {
    @Test
    public void testToCheckIcanAddItemToTest(){
         Set theSet = new Set();
         theSet.add("hi");
         assertFalse(theSet.isEmpty());
    }

    @Test
    public void testToCheckForDuplicateItem(){
        Set theSet = new Set();
        theSet.add("hello");
        theSet.add("hello");
        assertTrue(theSet.contain("hello"));
        assertEquals(1, theSet.size());
    }
}
