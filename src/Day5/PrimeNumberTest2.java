package Day5;

/**
 * BerINs
 * 2019-08-29 23:02
 */
public class PrimeNumberTest2 {
    public static void main(String[] args) {
        int count = 0;
        //获取当前时间距离1970-01-01 00：00：00的毫秒数
        long start = System.currentTimeMillis();

        laber:for(int i =2; i <= 100000; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++) {   //优化2：对本身是质数的自然数有效

                if(i % j == 0) {
                   continue laber;
                }
            }
                count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));
        System.out.println(count);

    }
}

