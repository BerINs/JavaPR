package Day7;

public class ArrayExer3 {
    public static void main(String[] args) {
        int[] arr1, arr2;

        arr1 = new int[]{2,3,5,7,11,13,17,19};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }


        System.out.println();

        arr2 = new int[arr1.length];    //数组的复制
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = i;
            }
            System.out.print(arr2[i] + "\t");
        }

        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
