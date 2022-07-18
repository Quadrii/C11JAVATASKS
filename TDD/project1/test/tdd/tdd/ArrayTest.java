package tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    List list;

    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @Test
    void newListIsEmptyTest() {
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_listIsNotEmptyTest() {
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    void addItem_removeItem_listIsEmptyTest() {
        list.add("E-String");
        list.remove("E-String");
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_sizeIncreasesTest() {
        list.add("A-String");
        assertEquals(1,list.size());
    }

    @Test
    void addX_addY_sizeIsTwoTest() {
        list.add("G-String");
        list.add("A-String");
        assertEquals(2, list.size());
    }

    @Test
    void addX_addY_removeY_sizeIsTwoTest() {
        list.add("G-String");
        list.add("A-String");
        list.add("E-String");
        list.remove("A-String");
        assertEquals(2, list.size());
    }

    @Test
    void addX_addY_removeY_listIsNotEmptyTest() {
        list.add("G-String");
        list.add("A-String");
        list.add("E-String");
        list.remove("A-String");
        assertFalse(list.isEmpty());
    }

    @Test
    void addX_retrieveXTest() {
        list.add("G-String");
        String gotten = list.get(0);
        assertEquals("G-String", gotten);
    }

    @Test
    void addXandY_retrieveYTest() {
        list.add("G-String");
        list.add("A-String");
        String gotten = list.get(1);
        assertEquals("A-String", gotten);
    }

    @Test
    void addXandY_retrieveXTest() {
        list.add("G-String");
        list.add("A-String");
        String gotten = list.get(0);
        assertEquals("G-String", gotten);
    }

    @Test
    void addX_YandZ_removeX_getXShouldReturnYTest() {
        list.add("G-String");
        list.add("A-String");
        list.add("E-String");
        list.add("D-String");
        list.add("F-String");
        list.remove("G-String");
        String gotten = list.get(3);
        assertEquals("D-String", gotten);
    }
    @Test
    public void addSixElement_capacityShouldDoubleTest(){
        assertEquals(5, list.capacity());
        list.add(("G-String"));
        list.add(("A-String"));
        list.add(("C-String"));
        list.add(("B-String"));
        list.add(("F-String"));
        list.add(("E-String"));
        list.add(("E-String"));
        assertEquals(10,list.capacity());
    }
}