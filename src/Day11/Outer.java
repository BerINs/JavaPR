package Day11;

/**
 * @author BerINs
 * @date 2020/11/7 下午6:27
 */


public class Outer {
    int index = 100;
    private int x = 10;
    class Inner {
        int index = 50;
        void print() {
            int index = 30;
            System.out.println(Outer.this.index);
        }
    }
    Inner getInner() {
        return new Inner();
    }
}


