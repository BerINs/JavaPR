package Day8;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
//        c1.radius = 2.1;
//        double area = c1.findArea();
//        System.out.println(area);

        c1.findArea(2.1);
    }
}

class Circle {

    double radius;

    //求圆的面积
    //方法一：
//    public double findArea() {
//        double area = Math.PI * radius * radius;
//        return area;
//    }

    //方法二：
    public void findArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println(area);
        System.out.println();
    }
}