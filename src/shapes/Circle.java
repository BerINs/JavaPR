package shapes;

/**
 * @author BerINs
 * @date 2020/11/7 下午4:23
 */


public class Circle extends Shapes {
    protected int radius;
    static final double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setCircumference() {
        circumference = 2 * pi * radius;
    }
    public void setArea() {
        area = pi * radius * radius;
    }

    public String toString() {
        return "" + area;
    }
}
