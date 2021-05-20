package cn.lzw.string;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author lzw
 * @version 2021/5/20 18:47
 */
public class LocalDateTimeTest{

    @Test
    public void test(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.withDayOfMonth(22));
        System.out.println(localDateTime.getDayOfMonth());

        System.out.println(localDateTime.plusDays(12));
        System.out.println(localDateTime.plusMonths(3));

        DateTimeFormatter isoWeekDate = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(localDateTime.minusYears(1));
        String format = localDateTime.format(isoWeekDate);
        System.out.println(format);

        TemporalAccessor parse = isoWeekDate.parse(format);
        System.out.println(parse);

        LocalDateTime of = LocalDateTime.of(2019, 12, 18, 19, 47);
        System.out.println(of);


    }
}
