package Shapes;

/**
 * @author BerINs
 * @date 11/6/20 7:47 PM
 */


public class Rectangle extends Shapes {
    protected int length;
    protected int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void setCircumference() {
        circumference = 2 * (length + width);
    }
    public void setArea() {
        area = length * width;
    }
    public String toString() {
        return ""+area;
    }


}
