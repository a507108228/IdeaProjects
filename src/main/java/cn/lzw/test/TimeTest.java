package cn.lzw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author lzw
 * @version 2021/4/29 20:09
 *
 * 有bug 我日期格式设置错了 现在改正了
 */
public class TimeTest{
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入日期：");
        String str = sc.nextLine();

        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd");

        Date date = new Date();

        String now = s.format(date);
        System.out.println("现在是："+now);

        Date oldDate = s.parse(str);
        System.out.println("您输入的日期为："+oldDate);
        String old = s.format(oldDate);
        System.out.println("old日期："+old);

        long t1 = date.getTime();
        long t2 = oldDate.getTime();
        long t3 = t1 - t2;

        System.out.println("相差的毫秒为"+t3);

        //    已经过去ago天了
        long ago = t3/1000/60/60/24;
        System.out.println(str+"\t距今已经过去"+"\t"+ago+"\t"+"天了");

        //    大概多少岁age
        // long age = ago/365;
        // System.out.println("大概"+age+"岁了");
/*        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Long.TYPE);
        System.out.println(Long.BYTES);*/

/*        System.out.println("\t");
        System.out.println("\n");
        System.out.println("\\");*/



    }


}
