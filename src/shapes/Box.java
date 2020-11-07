package shapes;

/**
 * @author BerINs
 * @date 11/6/20 8:02 PM
 */


public class Box extends Rectangle{
    private int width;

    Box(int h, int w) {
        super(h, w);
    }

    Box(int h, int w, int innerw) {
        this(h, w);
        width = innerw;
    }

    public void setWidth(int innerw) {
        width = innerw;
    }
    public int getWidth() {
        return width;
    }
    public void setCircumference() {
        super.setCircumference();
        circumference += 4 * width;
    }

    public int setArea(int innerw) {
        return width*width;
    }
    public void setArea() {
        area = length * super.width - setArea(width);
    }

    public static void main(String[] args) {
        System.out.println("Box类的操作情况如下：");
        Box b = new Box(10, 8, 2);
        b.setCircumference();
        b.setArea();
        System.out.println(b.getCircumference() + "  " + b.getArea());
    }
}
