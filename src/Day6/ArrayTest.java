package Day6;

public class ArrayTest {
    public static void main(String[] args) {
        int num;
        num = 10;
        int id = 1001;
        int[] ids = new int[]{1001,1002,1003,1004};   //静态初始化

        String[] names = new String[5];  //动态初始化
        names[0] = "小明";
        names[1] = "小红";
        names[2] = "小王";
        names[3] = "小海";
        names[4] = "小李";

        System.out.println(names.length);

        //如何遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
