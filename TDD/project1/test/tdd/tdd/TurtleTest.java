package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;
import static tdd.Direction.*;

public class TurtleTest {
    @Test
    public void turtleCanBeCreatedTest(){
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }
    @Test
    public void turtlePenIsUp(){
        Turtle ijapa = new Turtle();
        assertTrue(ijapa.isPenUp());
    }
    @Test
    public void penIsDefaultTest(){
        Turtle ijapa = new Turtle();
        assertTrue(ijapa.isPenUp());
    }
    @Test
    public void turtlePenIsDownTest(){
        Turtle ijapa = new Turtle();
        assertTrue(ijapa.isPenUp());
        ijapa.isPenUp();
        assertFalse(ijapa.isPenDown());
    }

    @Test
    public void turtlePenIsUpTest(){
        Turtle ijapa = new Turtle();
        assertTrue(ijapa.isPenUp());
        ijapa.isPenDown();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void whenFacingEast_turtleCanTurnRightTest(){
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingEast_turtleCanTurnLeftTest(){
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }


    @Test
    public void whenFacingWest_turtleCanTurnRightTest(){
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
    }

    @Test
    public void whenFacingNorth_turtleCanTurnLeftTest(){
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveForwardFacingEastTest(){
        Turtle ijapa = new Turtle();
        ijapa.move(5);
        assertEquals(new Position(0,5), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingSouthTest(){
        Turtle ijapa = new Turtle();
        ijapa.move(10);
        assertEquals(new Position(0,10), ijapa.getCurrentPosition());
    }
}