package Day4;

import java.util.Scanner;

/**
 * BerINs
 * 2019-08-24 19:47
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入岳小鹏期末成绩: ");
        int score = in.nextInt();

        if (score == 100) {
            System.out.println("奖励一辆BMW.");
        }else if(80 < score && score <= 99){
            System.out.println("奖励一台iphone xs max");
        }else if(60 <= score && score <=80){
            System.out.println("奖励一个iPad");
        }else{
            System.out.println("啥都没有");
        }
    }
}
