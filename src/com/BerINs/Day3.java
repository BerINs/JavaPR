package com.BerINs;

import java.util.Scanner;

/**
 * BerINs
 * 2019-07-03 17:00
 */
public class Day3 {

    public static void main(String[] args) {

        int i1 = 1;
        int b1 = i1++;

        int i2 = 1;
        int b2 = ++i2;
        System.out.println(b1);
        System.out.println(b2);

        short s1 = 1;
        s1++;//自增1不会改变原有的数据类型
        System.out.println(s1);

        //随意给出一个整数，打印现实它的个位数，十位数，百位数的值
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("个位数: " + x%10);
        System.out.println("十位数: " + x/10%10);
        System.out.println("百位数: " + x/100);
        //尽量不要在打印层计算

        short ss1 = 10;
        //s1 = s1 + 2;  //int转化为short，编译失败
        ss1 += 2;       //类型不转化，可以编译(推荐)
        ss1++;          //可以编译
        System.out.println(ss1);

        int num1 = 10;
        num1 += (num1++) + (++num1);   // num1 + num1 , num1++
        System.out.println(num1);

        //逻辑运算符（都是Boolean类型变量

    }





}
