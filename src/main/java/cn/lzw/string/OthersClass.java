package cn.lzw.string;


import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * @author lzw
 * @version 2021/5/21 10:14
 */
public class OthersClass{

    @Test
    public void test1(){
        //    System
        String property = System.getProperty("java.version");
        System.out.println(property);

        //    Math 加减乘除 绝对值 取模 开方 等等
        System.out.println(Math.addExact(10, 20));

        //    BigInteger 精度无上线 可以调用加减乘除等数学方法
        //    BigDecimal 可以调用数学方法 有卵用？
        BigInteger bigInteger = new BigInteger("999999999999999999999999999999999999999");
        BigDecimal bigDecimal = new BigDecimal("999999999.999998888888");
        System.out.println(bigInteger.toString());
        System.out.println(bigDecimal.movePointLeft(10));

    }
}
