package Day5;

import java.util.Scanner;

/**
 * BerINs
 * 2019-08-29 16:16
 */
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int positiveNumber = 0;
        int negativeNumber = 0;

        while( number != 0) {
            if(number < 0) {
                negativeNumber++;
            }else {
                positiveNumber++;
            }
            number = in.nextInt();
        }
        System.out.println("正数:" + positiveNumber);
        System.out.println("负数:" + negativeNumber);
    }
}
