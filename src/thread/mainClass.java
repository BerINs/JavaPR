package thread;

/**
 * @author BerINs
 * @date 2020/11/8 下午4:44
 */


public class mainClass {
    public static void man(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
    }
}
