package Day4;

import java.util.Scanner;

/**
 * BerINs
 * 2019-08-28 23:36
 */
//从键盘上输入2019年的"month"和"day"，要求通过输入的日期为2019年的第几天
public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int sumdays = 0;
        switch(month){
            case 12 :
                sumdays += 31;
            case 11 :
                sumdays += 30;
            case 1 :
                sumdays += day;
                //...
        }
    }
}
