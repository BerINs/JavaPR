package Shapes;

/**
 * @author BerINs
 * @date 11/6/20 7:43 PM
 */


abstract class Shapes {
    protected double circumference;
    protected double area;
    abstract void setCircumference();
    abstract void setArea();
    public double getCircumference() {
        return circumference;
    }
    public double getArea() {
        return area;
    }
}
