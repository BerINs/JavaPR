package Day4;

/**
 * BerINs
 * 2019-08-29 14:06
 */
public class ForTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello World!");
        }

        //练习1
        int num = 1;
        for(System.out.print('a'); num <= 3; System.out.print('c'), num++){
            System.out.print('b');
        }
        System.out.println();

        //例题：遍历100以内的偶数
        int sum = 0;    //总和
        int count = 0;  //个数
        for(int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                count ++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
