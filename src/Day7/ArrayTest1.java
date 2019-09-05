package Day7;

public class ArrayTest1 {
    public static void main(String[] args) {

        //1.先定义一个int型的数组，包含10个元素，分别赋一些随机整数。
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*90 + 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr.length);
        //2.然后求出所有元素的最大值，最小值，和值，平均数，并输出出来。
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为：" + maxValue);

        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值为：" + minValue);

        int total = arr[0];
        for (int i = 1; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("总和为：" + total);

        double avr = total/(double)arr.length;
        System.out.println("平均数为：" + avr);


    }
}
