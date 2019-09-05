package Day7;

import javax.sound.midi.Soundbank;

public class ArrayTest2 {
    public static void main(String[] args) {

        String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};

        //数组的复制
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
        //方式一
//        for (int i = 0; i < arr.length / 2; i++) {
//            String temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i -1] = temp;
//        }
        //方式二
//        for (int i =0, j = arr.length - 1; i < j; i++,j--) {
//            String temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

//        for (int i =0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }

        //查找
        //线性查找
        String dest = "Bc";

        boolean isFlag = true;

        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("很遗憾，没有找到哦！");
        }
    }
}
