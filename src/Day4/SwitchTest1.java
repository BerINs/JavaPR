package Day4;

/**
 * BerINs
 * 2019-08-28 23:30
 */
//使用SWITCH语句判断学生成绩，60以上及格，反之不及格。
public class SwitchTest1 {
    public static void main(String[] args) {
        int score = 78;
        switch(score / 60){
            case 0:
                System.out.println("不及格");
            case 1:
                System.out.println("及格");

        }
    }
}
