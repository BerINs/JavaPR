package io;

import javax.sound.midi.Soundbank;
import java.io.*;

/**
 * @author BerINs
 * @date 2020/11/8 下午2:36
 */


public class ExampleByteArrayInputStream {
    public static void main(String[] args) throws IOException {
        byte[] b;
        int c;
        ByteArrayInputStream bai;
        b = new byte[10];
        System.out.println("请输入10个英文字母：");
        for (int i = 0; i < 10; i++) {
            b[i] = (byte) System.in.read();
        }
        System.out.println("显示数组元素：");
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i] + "");
        }
        System.out.println();

        bai = new ByteArrayInputStream(b);
        System.out.println("转换为大写：");
        while ((c = bai.read()) != -1) {
            System.out.print(Character.toUpperCase((char)c)+ "");
        }
        System.out.println();
        bai.close();
    }
}
