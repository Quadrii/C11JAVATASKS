package tdd;
public class RectanglePerArea {
    private double length = 1.0;
    private double width = 1.0;

    public void setLength(double length) {
        if (length > 0.0 && length <= 20.0){
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (length > 0.0 && length <= 20.0){
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calcPerimeter(){
        double perimeterOfRectangle;
        double addLengthandWidth = length + width;
        perimeterOfRectangle =  2 * addLengthandWidth;
        return perimeterOfRectangle;
    }

    public  double calcArea(){
        double areaOfRectangle;
        areaOfRectangle = length * width;
        return areaOfRectangle;
    }
}
