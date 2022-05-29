package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RectanglePerAreaTest {
    @Test
    public void testRectanglePerimeter(){
        RectanglePerArea rectanglePerArea = new RectanglePerArea();
        rectanglePerArea.setLength(5.0);
        rectanglePerArea.setWidth(3.0);
        assertEquals(16.0, rectanglePerArea.calcPerimeter());
    }

    @Test
    public  void testArea(){
        RectanglePerArea rectanglePerArea = new RectanglePerArea();
        rectanglePerArea.setWidth(6.0);
        rectanglePerArea.setLength(2.0);
        assertEquals(12.0, rectanglePerArea.calcArea());
    }
}
