package Day4;

import java.util.Scanner;

/**
 * BerINs
 * 2019-08-24 20:02
 */
public class IfTest2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 = in.nextInt();

        System.out.println("请输入第二个整数：");
        int num2 = in.nextInt();

        System.out.println("请输入第三个整数：");
        int num3 = in.nextInt();

        if (num1 > num2) {
            if (num3 > num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            }else if(num3 <= num2){
                System.out.println(num2 + "," + num1 + "," + num3);
            }else{
                System.out.println(num2 + "," + num1 + "," + num3);
            }
        }
    }
}
//今天出去玩，跳过这个