package tdd;

import static tdd.Direction.*;

public class Turtle {
    private boolean penUp = true;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);
    public boolean isPenUp() {
       return penUp;
    }

    public boolean isPenDown() {
        return false;
    }

    public Direction getCurrentDirection(){
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == EAST){
            currentDirection = SOUTH;
            return;
        }
        if (currentDirection == SOUTH){
            currentDirection = WEST;
            return;
        }
        if (currentDirection == WEST){
            currentDirection = NORTH;
            return;
        }
        if (currentDirection == NORTH){
            currentDirection = EAST;
        }
    }

    public void turnLeft() {
        if (currentDirection == EAST){
            currentDirection = NORTH;
            return;
        }
        if (currentDirection == NORTH){
            currentDirection = WEST;
            return;
        }
        if (currentDirection == WEST){
            currentDirection = SOUTH;
            return;
        }
        if (currentDirection == SOUTH){
            currentDirection = EAST;
        }
    }

    public void move(int i) {
        int currentRow = currentPosition.getRow();
        if (currentDirection == EAST){
            increaseColumnBy(i);
        }
        if (currentDirection == SOUTH){
            increaseColumnBy(i);
        }
    }

    public Position getCurrentPosition(){
        return currentPosition;
    }
    private void increaseColumnBy(int i){
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(i + currentColumn);
    }
}
