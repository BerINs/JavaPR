package Day4;

import java.util.Scanner;

/**
 * BerINs
 * 2019-08-28 22:10
 */
public class IfTest4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的身高: (cm)");
        int height = in.nextInt();
        System.out.println("请输入你的财富: (千万)");
        double wealth = in.nextDouble();
        System.out.println("请输入你是否帅: (true/false)");
        boolean isHandsome = in.nextBoolean();

        if (height >= 180 && wealth >= 1 && isHandsome) {
            System.out.println("我一定要嫁给他!!!");
        }else if(height >=180 || wealth >= 1 || isHandsome){
            System.out.println("嫁了吧，比上不足，比下有余。");
        }else{
            System.out.println("不嫁。");
        }
    }
}
