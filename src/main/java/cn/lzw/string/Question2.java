package cn.lzw.string;

import java.util.Scanner;

/**
 * @author lzw
 * @version 2021/5/19 19:20
 * <p>
 * 题目一：调用方法删除 字符串的空格 两端
 */
class A{
    String s1;
    String s2;

    public void delete (String s2, String s1){
        if( s1.replaceAll("^ | $", "") != null ){
            s2 = s1.replaceAll("^ | $", "");
            System.out.println(s2);
        }
    }
}

public class Question2{
    public static void main (String[] args){
        A a = new A();
        System.out.println("please input the word: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();

            if( "e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s) ){
                System.out.println("程序结束");
            }

            String s3 = "";

            a.delete(s3, s);
        }

        scanner.close();
    }
}
