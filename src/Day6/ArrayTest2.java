package Day6;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        //二维数组静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //二维数组动态初始化
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);
        System.out.println(arr1.length);
        System.out.println(arr1[1].length);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

}
