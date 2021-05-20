package cn.lzw.string;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lzw
 * @version 2021/5/20 14:26
 */
public class DataTest{
    @Test
     public void test() throws ParseException{
        String string = "1998.10.08";
        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd");
        Date date1 = s.parse(string);
        Date date = new Date();
        System.out.println("1--->"+date);

        System.out.println("2--->"+date.toString());

        System.out.println("3--->"+date.getTime());

        int i = date.compareTo(date1);
        System.out.println("4--->"+i);

        boolean before = date.before(date1);
        System.out.println("5--->"+before);

        boolean after = date.after(date1);
        System.out.println("6--->"+after);

        boolean equals = date.equals(date1);
        System.out.println("7--->"+equals);

        date.setTime(1998);




    }

//    字符串转日期
    @Test
    public void test02() throws ParseException{
        String str = "2020.01.22 ";
        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd");
        Date date = s.parse(str);
        System.out.println(date);
    }

//    日期转字符串
    @Test
    public void test03(){
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd");
        String s1 = s.format(date);
        System.out.println(s1);
    }

//    字符串日期转java.sql.date
    @Test
    public void test04() throws ParseException{
        String birth = "1998.10.08";
        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd");
        Date date = s.parse(birth);//    java.util.date 下面的date

        java.sql.Date date1 = new java.sql.Date(date.getTime());//    java.sql.date下面的date
        System.out.println(date1);
    }


}
