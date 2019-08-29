package Day5;

/**
 * BerINs
 * 2019-08-29 21:39
 */
public class PrimeNumberTest1 {
    public static void main(String[] args) {
        boolean isFlag = true;
        int count = 0;
        //获取当前时间距离1970-01-01 00：00：00的毫秒数
        long start = System.currentTimeMillis();

        for(int i =2; i <= 100000; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++) {   //优化2：对本身是质数的自然数有效

                if(i % j == 0) {
                    isFlag = false;
                    break;      //优化一：只对非质数的自然数有效
                }
            }

            if (isFlag == true) {
                //System.out.println(i);
                count++;
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));
        System.out.println(count);

    }
}
