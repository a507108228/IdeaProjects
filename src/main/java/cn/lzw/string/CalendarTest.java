package cn.lzw.string;

import org.junit.Test;
import java.util.Calendar;
import java.util.Date;

/**
 * @author lzw
 * @version 2021/5/20 15:37
 */
public class CalendarTest{
    @Test
    public void test01(){
        long l = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        System.out.println("1--->:"+instance.getClass());

        int week = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println("一周里面的第几天--->"+week);

        int i = instance.get(Calendar.AM);
        System.out.println("上午还是下午 1代表不是上午--->"+i);

        int i1 = instance.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int i2 = instance.get(Calendar.DAY_OF_YEAR);
        System.out.println("DAY_OF_WEEK_IN_MONTH--->"+i1);
        System.out.println("DAY_OF_YEAR--->"+i2);

        instance.add(Calendar.DAY_OF_YEAR,141); //    在此时 140 天上加 141 天 结果为281
        System.out.println("修改一年之中的第几天"+instance.get(Calendar.DAY_OF_YEAR));

        System.out.println(instance.getTime());
        Date time = instance.getTime();
        System.out.println(time);

        Date date = new Date();
        instance.setTime(date);
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));

        long l1 = System.currentTimeMillis();
        long l2 = l1 - l;
        System.out.println(l2);
    }
}
