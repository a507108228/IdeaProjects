package cn.lzw.test;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author lzw
 * @version 2021/4/29 20:09
 */
public class TimeTest{
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入日期：");
        String str = sc.nextLine();

        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.hh");

        Date nowData = new Date();

        String now = s.format(nowData);
        System.out.println("现在的日期是："+now);

        Date oldData = s.parse(str);
        String old = s.format(oldData);

        long t1 = nowData.getTime();
        long t2 = oldData.getTime();
        long t3 = t1 - t2;

        System.out.println(str+"\t距今已经过去"+"\t"+t3/1000/60/60/24+"\t"+"天了");

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
