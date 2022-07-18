package tdd;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class QueueTest {
    @Test
    public void testThatIcanAddItemToQueue(){
        Queue queue = new Queue();
        queue.add("firstQueue");
        assertFalse(queue.isEmpty());
    }
    @Test
    public void testThatIcanRemoveItemFromQueue(){
        Queue queue = new Queue();
        queue.add("good");
        queue.add("fair");
        queue.add("bad");
        queue.remove("bad");
        assertEquals(2, queue.size());
    }
    @Test
    public void testForPeek(){
        Queue queue = new Queue();
        queue.add("hello");
        queue.add("to");
        queue.add("you");
        assertEquals("hello", queue.peek());
    }
//    @Test
//    public void testFor
}
