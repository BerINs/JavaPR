package Day5;

import java.util.Scanner;

/**
 * BerINs
 * 2019-08-29 14:38
 */

//题目：输入两个正整数m和n，求其最大公约数和最小公倍数

public class ForTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("请输入第一个正整数：");
        int m = in.nextInt();
        System.out.print("请输入第二个正整数：");
        int n = in.nextInt();

        int min = (m < n)? m : n;
        for(int i = min; i >=1; i--) {
            if(m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }
        }

        int max = ( m > n)? m : n;
        for(int i = max; i <= m*m; i++) {
            if(i % m == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
