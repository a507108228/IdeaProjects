package cn.lzw.test;

import java.util.Scanner;

public class TextScaanner {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "请输入名字：" );
        String name = scanner.nextLine ( );
        System.out.println ( "请输入爱好：" );
        String faver = scanner.nextLine ( );
        System.out.println ( "请输入年龄：" );
        int age = scanner.nextInt ( );

        System.out.println ( "###########" );
        System.out.println ( name );
        System.out.println ( faver );
        System.out.println ( age );
        System.out.println ( "离开地球的天数：" + ( 100 - age ) * 365 );

    }

}
