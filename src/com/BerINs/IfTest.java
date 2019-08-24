package com.BerINs;

import java.util.Scanner;

/**
 * BerINs
 * 2019-08-24 18:05
 */
public class IfTest {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int heartBeats = in.nextInt();
//        if (heartBeats < 60 || heartBeats > 100) {
//            System.out.println("需要做近一步检查");
//        }
//        System.out.println("检查结束");
        boolean x = true;
        boolean y = false;
        short z = 40;
        if((z++ == 40) && (y = true)){
            z++;
        }
        if((x = false) || (++z == 43)){
            z++;
        }
        System.out.println("z = " + z);

    }
}
