package Day4;

/**
 * BerINs
 * 2019-08-24 19:29
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num);

        //对于char型的获取，Scanner不提供相关的方法，只能获取一个字符串
        System.out.println("（男/女");
        String gender = in.next();
        char genderChar = gender.charAt(0);
        System.out.println(gender);
    }


}
