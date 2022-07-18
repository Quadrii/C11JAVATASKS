package tdd;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class StackTest {
    @Test
    public void checkIfStackIsEmpty(){
        Stack myStack = new Stack();
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void addItemToStack(){
        Stack myStack = new Stack();
        myStack.push("hi");
        assertEquals(1, myStack.size());
    }
    @Test
    public void removeItemFromStack(){
        Stack myStack = new Stack();
        myStack.push("hello");
        myStack.push("hi");
        myStack.pop("hello");
        assertEquals(1, myStack.size());
    }
    @Test
    public void checkForPeek(){
        Stack myStack = new Stack();
        myStack.push("hello");
        myStack.push("hi");
        myStack.push("hurray");
        assertEquals("hurray", myStack.peek());
    }
}
