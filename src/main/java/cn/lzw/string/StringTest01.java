package cn.lzw.string;

import org.junit.Test;



/**
 * @author lzw
 * @version 2021/5/18 17:09
 */
public class StringTest01{

    @Test
    public void test01 (){

        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e'};
        String s1 = new String(chars, 2, 3);
        String s2 = "cde";

        //      s2位于方法区常量池中且 不可变 ，s1位于堆中
        System.out.println(s1 == s2);
        System.out.println(s2.getBytes());
        System.out.println(s1.getBytes());
        System.out.println(s1);
    }


    /**
     * String s = new String("abc"); 内存中创建几个对象？
     * 一个堆空间new结构 一个char[] 对应的常量池中的数据 ：“abc"
     * <p>
     * true
     * false
     * false
     * false
     * true
     * true
     * false
     * false
     */
    @Test
    public void test02 (){
        String s1 = "javaEE";
        String s2 = "javaEE";

        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2); //    两者都位于方法区常量池中
        System.out.println(s1 == s3); //    一个位于常量池不可变 一个位于堆中
        System.out.println(s1 == s4); //    一个位于常量池不可变 一个位于堆中
        System.out.println(s3 == s4); //    两者都位于堆中 属于new的对象

        Person p1 = new Person("Tom", 18);
        Person p2 = new Person("Tom", 18);

        //    字面量定义 都在常量池里
        System.out.println(p1.name.equals(p2.name)); //    true
        System.out.println(p1.name == p2.name); //    true

        System.out.println(p1.equals(p2)); //    f
        System.out.println(p1 == p2); //    f
    }


    /**
     * true
     * false
     * false
     * false
     * false
     * false
     * false
     * false
     * false
     * false
     * <p>
     * 常量与常量的拼接 结果位于常量池中 不会存在相同的常量
     * 只要有一个是变量 结果位于堆中
     * 如果拼接的结果调用intern（）方法 返回值在常量池中
     */
    @Test
    public void test03 (){

        String s1 = "abc";
        String s2 = "xyz";
        //    s5 s6 s7 有变量 位于堆中
        String s3 = "abcxyz";
        String s4 = "abc" + "xyz";
        String s5 = s1 + "xyz";
        String s6 = "abc" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); // T

        System.out.println(s3 == s5); // F
        System.out.println(s3 == s5.intern()); // T

        System.out.println(s3 == s6); // F
        System.out.println(s3 == s7); // F

        System.out.println(s4 == s5); // F
        System.out.println(s4 == s6); // F
        System.out.println(s4 == s7); // F  也是错误的

        System.out.println(s5 == s6); // F
        System.out.println(s5 == s7); // F

        System.out.println(s6 == s7); // F

    }

}
