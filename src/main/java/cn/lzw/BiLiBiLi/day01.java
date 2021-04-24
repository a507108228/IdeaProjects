package cn.lzw.BiLiBiLi;

import java.util.Scanner;

/**
 * @author lzw
 * @date 2020/10/25 11:40
 * @description scanner 获取各种类型
 */
public class day01 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner ( System.in );

        System.out.print("请输入你的姓名：");
        String name = sc.nextLine ();


        System.out.print("请输入你的年龄：");
        int age = sc.nextInt ();


        System.out.print("请输入你的身高：");
        float height = sc.nextFloat ();


        System.out.print("你是否单身（true/false）：");
        Boolean danshen = sc.nextBoolean ();

        System.out.println("###############");
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(danshen);
        long end =System.currentTimeMillis();
        System.out.println("用时为："+(end-start));


    }
}
