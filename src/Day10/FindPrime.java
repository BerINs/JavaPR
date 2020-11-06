package Day10;

import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        z = y/2;
        for (x = 2; x < z; x++) {
            if (y % x == 0) {
                System.out.println(y + " is not a prime.");
                break;
            }
        }
        if (y % x != 0) {
            System.out.println(y + " is a prime.");
        }
    }
}
