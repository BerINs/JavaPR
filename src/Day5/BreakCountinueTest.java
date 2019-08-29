package Day5;

/**
 * BerINs
 * 2019-08-29 22:07
 */
public class BreakCountinueTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {

            if(i % 4 == 0) {
                break;
//                continue;
            }
            System.out.println(i);
        }
        System.out.println();
    }
}
