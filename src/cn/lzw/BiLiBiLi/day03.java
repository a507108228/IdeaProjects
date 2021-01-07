package cn.lzw.BiLiBiLi;

import java.util.Scanner;

/**
 * @author： lzw
 * @date： 2020/11/15 17:43
 * @description：
 */
public class day03 {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in ) ;
        System.out.println("请输入第一个参数：");
        int A =sc.nextInt ();
        System.out.println("请输入第二个参数：");
        int B =sc.nextInt ();
        System.out.println("请输入第三个参数：");
        int C =sc.nextInt ();
        int resultA = sum ( A,B );
        int resultB = sum ( A,B,C );
        int resultC = sum ( A,B,C );
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);

    }
    public static int sum(int x ,int y){
        return x+y;
    }
    public static int sum(int x ,int y ,int z){
        return x+y+z;
    }
    public static double sum(double x ,double y ,double z){
        return x+y+z;
    }


}


