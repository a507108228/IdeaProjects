package cn.lzw.imook;


import java.util.Scanner;

/**
 * @author lzw
 * @date 2020/9/6 13:31
 * @description 录入班级学员的成绩并求取平均值
 */
public class Demo {
    public static void main(String[] args) {
        int claNum = 3;
        int stuNum = 4;
        int num = 0;
        double avg = 0;
        for ( int i = 1 ; i <= claNum ; i++ ) {
            System.out.println ( "***请输入第" + i + "个班级***" );
            num = 0;
            for ( int j = 1 ; j <= stuNum ; j++ ) {
                System.out.print ( "请输入第" + j + "个学员的成绩：" );

                int sc = new Scanner ( System.in ).nextInt ( );
                num = num + sc;

            }
            avg = num / stuNum;
            System.out.println ( "平均成绩为：" + avg );
        }
        //System.out.println("平均成绩为："+avg);

    }
}
