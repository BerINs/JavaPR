package com.BerINs;

/**
 * Berior
 * 2019-06-30 21:56
 */
public class Day2 {
    public static void main(String[] args) {
        int n1 = 129;
        byte n2 = 3;
        float n3 = n1 + n2;
        System.out.println(n3);

        double d1 = 3.14;
        int d2 = (int)d1;
        System.out.println(d2);

        int i1 = 128;
        byte b = (byte)i1;
        System.out.println(b);

        byte b1 = 12;
        byte b2 = 21;
        int b3 = b1 + b2;
        System.out.println(b3);

        String s1 = 3.15f + "";
        System.out.println(s1);

        //各种进制转换

        int num1 = 0b111;
        int num2 = 0127;
        int num3 = 0x12AF;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        char c1 ='a';
        char c2 = 97;
        System.out.println(c1);
        System.out.println(c2);

    }
}