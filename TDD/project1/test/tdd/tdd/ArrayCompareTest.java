package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ArrayCompareTest {
    @Test
    public void compareArray(){
        ArrayCompare arrayEqual = new ArrayCompare();
        String[] a={"a", "b", "c", "d"};
        String[] b={"a", "b", "c", "d"};
        assertTrue(arrayEqual.compareTwoArrays(a, b));
    }
}
