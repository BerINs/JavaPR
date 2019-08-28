package Day4;

/**
 * BerINs
 * 2019-08-28 21:57
 */

//如何获取一个随机数: 10 - 99
public class IfTest3 {
    public static void main(String[] args) {
        int value = (int)(Math.random() * 90 + 10);
        System.out.println(value);
    }
}
//公式:[a, b] : (int)(Math.random()*(b-1+1)+a);