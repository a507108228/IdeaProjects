package cn.lzw.BiLiBiLi;

import java.util.Scanner;

/**
 * @author： lzw
 * @date： 2020/11/22 15:27
 * @description： 数组 方法  键盘录入数据数组排序输出
 */
class ArrayUtil {
    public static void sort ( int data[] ) {
        for ( int x = 0 ; x < data.length ; x++ ) {
            for ( int y = 0 ; y < data.length - x - 1 ; y++ ) {
                if ( data[ y ] > data[ y + 1 ] ) {
                    int temp = data[ y ];
                    data[ y ] = data[ y + 1 ];
                    data[ y + 1 ] = temp;
                }
            }
        }
    }

    public static void printArray ( int data[] ) {
        for ( int t : data ) {
            System.out.print( t + "、" );
        }
    }
}

public class D09_ArrayUtil {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        System.out.println( "请输入数组长度及元素：" );

        String str = sc.nextLine( );

        String[] da = str.split( "," ); //键盘录入字符串  ，分割开

        int[] data = new int[ da.length ];

        for ( int i = 0 ; i < data.length ; i++ ) {
            data[ i ] = Integer.parseInt( da[ i ] ); //字符串转成数组
        }

        ArrayUtil.sort( data );

        ArrayUtil.printArray( data );
    }
}
