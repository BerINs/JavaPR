package com.BerINs;

public class Day4{
    public static void main(String[] args){
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;
        int max1 = (n1 > n2)? n1 : n2;
        int max2 = (max1 > n3)? max1 : n3;
        System.out.println(max2);

        if (n1 > n2) {
            if(n1 > n3){
                System.out.println(n1);
            }else{
                System.out.println(n3);
            }
        }else if(n2 > n3){
            System.out.println(n2);
        }else{
            System.out.println(n3);
        }
    }

}