package cn.lzw.bilibili;

import java.util.Scanner;

/**
 * @author： lzw
 * @date： 2020/12/4 19:06
 * @description：
 */
public class D14_JaDe {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "请输入学生人数：" );
        int mark = sc.nextInt( );
        int[] arr = new int[ mark ];
        System.out.println( "请输入" + mark + "个成绩：" );
        int max = 0;

        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr[ i ] = sc.nextInt( );
            if ( max < arr[ i ] ) {
                max = arr[ i ];
            }
        }
        char level;
        int i;
        for ( i = 0; i < arr.length ; i++ ) {

            if ( max - arr[ i ] <= 10 ) {
                level = 'A';
            } else if ( max - arr[ i ] <= 20 ) {
                level = 'B';
            } else if ( max - arr[ i ] <= 30 ) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println( "成绩：" + arr[ i ] + "\t" + "等级：" + level );
        }
    }
}


