package Day10;

public class BubbleSort {
    public static void main(String[] args) {
        int k;
        int[] a = new int[10];
        System.out.println("input 10 numbers:");
        for (int i = 0; i< 10; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9-i; j++) {
                if (a[j] > a[j+1]) {
                    k = a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                }
            }
        }
        System.out.println("the sorted numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
