package tdd;

public class Position {
    private int row;
    private int column;
    private SketchPad sc;
    public Position (int row, int column){
        this.row = row;
        this.column = column;
    }
    @Override
    public boolean equals(Object input){
        Position compared = (Position) input;
        if (row == compared.getRow() && column == compared.getColumn()) return true;
        return false;
    }

    int getColumn() {
        return column;
    }

    int getRow() {
        return row;
    }

    @Override
    public String toString(){
        return String.format("Row: %d column %d", row, column);
    }

    public void setColumn(int i) {
        this.column = i;
    }
}
