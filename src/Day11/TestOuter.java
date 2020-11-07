package Day11;

/**
 * @author BerINs
 * @date 2020/11/7 下午6:33
 */


public class TestOuter {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print();
        System.out.println(outer.getInner());
    }
}
