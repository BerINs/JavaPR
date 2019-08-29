package Day5;

/**
 * BerINs
 * 2019-08-29 14:58
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        int num = 1;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }while(num <= 100);

    }
}
