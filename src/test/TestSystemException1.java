package test;

/**
 * @author BerINs
 * @date 2020/11/7 下午6:15
 */


public class TestSystemException1 {
    public static void main(String[] args) {
        int a = 0, b = 5;
        try {
            System.out.println(b / a);
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(a + b);
    }
}
