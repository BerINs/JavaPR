package Day6;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入学生个数：");
        int stuNum = in.nextInt();
        int maxScore = 0;
        int[] scores = new int[stuNum];
        System.out.println("请输入" + stuNum + "个学生成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        char level;
        for ( int i =0; i < scores.length; i++) {
            if (maxScore - scores[i] <= 10) {
                level = 'A';
            }else if (maxScore - scores[i] <= 20) {
                level = 'B';
            }else if (maxScore - scores[i] <= 30) {
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student " + (i+1) + " score is " + scores[i] + ", grade is " + level);
        }
    }
}
