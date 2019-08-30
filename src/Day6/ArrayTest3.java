package Day6;

public class ArrayTest3 {
    public static void main(String[] args) {

        int[][] arr = new int[4][3];
        System.out.println(arr[0]); //地址值
        System.out.println(arr[0][0]);

        //float : 0.0
        //String : null
        //Boolean : false

        System.out.println();

        double[][] arr3 = new double[4][];
        System.out.println(arr3[0]);    //null
//      System.out.println(arr3[0][1]); //报错：空指针

        System.out.println();

        int[][] arr1 = new int[4][];
        arr1[1] = new int[]{1,2,3};
        arr1[2] = new int[4];
        arr1[2][1] = 30;
        System.out.println(arr1[1][2]);
        System.out.println(arr1[2][2]);
    }
}
