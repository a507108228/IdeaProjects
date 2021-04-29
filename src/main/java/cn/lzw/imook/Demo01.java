package cn.lzw.imook;


import java.util.Scanner;

public class Demo01 {

    public static void main ( String[] args ) {
        System.out.print ( "请输入分数：" );
        int score = new Scanner ( System.in ).nextInt ( );//年龄 数字用int 字符类用String
        System.out.println ( "加分前成绩: " + score );
        int count = 0;
        do {
            count++;
            score++;
        } while ( score < 60 );
        System.out.println ( "加分后的分数：" + score + "\n" + "共加了" + count + "次" );


    }
}

