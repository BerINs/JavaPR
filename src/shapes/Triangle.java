package shapes;

/**
 * @author BerINs
 * @date 11/7/20 12:40 AM
 */


public class Triangle extends Shapes{
    protected int sideA;
    protected int sideB;
    protected int sideC;

    public Triangle(int a, int b, int c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public void setCircumference() {
        circumference = sideA + sideB + sideC;
    }
    public void setArea() {
        double p = this.getCircumference()/2;
        area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
