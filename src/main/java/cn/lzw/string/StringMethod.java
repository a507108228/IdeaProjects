package cn.lzw.string;


import org.junit.Test;

import java.util.Arrays;


/**
 * @author lzw
 * @version 2021/5/18 18:39
 *          String方法
 */
public class StringMethod{
    @Test
    public void test(){
       String s1 = "hello World";
       String s2 = "  I LOVE U  ";
       String s3 = "abc";
       String s4 = "abe";

        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(6));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.compareToIgnoreCase(s2));
        System.out.println("----"+s2.trim());

        System.out.println(s3.compareTo(s4)); //    s3 与 s4比较ascII码大小

        System.out.println(s1.substring(4));
        System.out.println(s1.substring(0, 6)); //    左闭右开 6不包含
        System.out.println(s1.subSequence(0, 6));
    }

    @Test
    public void test02(){
        String s1 = "helloworld";
        boolean b1 = s1.endsWith("e");
        System.out.println(b1);

        boolean b2 = s1.startsWith("he");
        System.out.println(b2);

        boolean b3 = s1.startsWith("ll",2);//    判断指定位置是不是以“”开始的
        System.out.println(b3);

        String s2 = "wo";
        System.out.println(s1.contains(s2)); //    判断s1是否包含s2

        System.out.println(s1.indexOf("wo"));
        System.out.println(s1.indexOf("l",0)); //    从指定位置开始找指定字符


        String s3 = "hellorworld";
        System.out.println(s3.lastIndexOf("or"));
        System.out.println(s3.lastIndexOf("or",6)); //    从指定位置开始找最后一次出现的字符 索引依旧是从左往右数
    }

    @Test
    public void test03(){
        String s1 = "123jiujiuguiyi123";
        String s2 = "123九九归一456";

        System.out.println(s1.replace('j', 'g'));
        System.out.println(s2.replace('九', '八'));

        System.out.println(s2.replace("九九", "baba"));

        // System.out.println(s1.replaceAll(" ", ","));

        String str = s2.replaceAll("\\d++", ",")
                .replaceAll("^,|,$", "学习最终"); //    "^,|,$"不能有空格 空格也会成为他筛选的条件
        System.out.println(str);

    }

    @Test
    public void test04(){
        String s1 = "12345";

        boolean b1 = s1.matches("\\d++");
        System.out.println(b1);

        String tel = "18657295867";
        boolean result = tel.matches("186\\d{7,8}");
        System.out.println(result);

        String s2 = "hello|zhang|yu|i|miss|you";
        String[] str = s2.split("\\|");
        for( int i = 0; i < str.length ; i++ ){
            System.out.println(str[i]);
        }
        System.out.println();

        String[] str2 = s2.split("\\|", 2);
        for( int i = 0; i < str2.length ; i++ ){
            System.out.println(str2[i]);
        }
        System.out.println();
    }


    @Test
    /**
     *  String 包装类 互相转换
     *  String char[] 互相转换
     *  String byte[] 互相转换
     */
    public void test05(){
        String x = "123";

        int num = Integer.parseInt(x);
        System.out.println(num);
        int sum = num + 100;
        System.out.println(sum);


        String s = String.valueOf(num);
        System.out.println(s);

        String s1 = s + "456789";
        System.out.println(s1);

        String x2 = "abc123def";
        char[] chars = x2.toCharArray();
        for( int i = 0; i < chars.length ; i++ ){
            System.out.println(chars[i]);
        }

        String s2 = String.valueOf(chars);
        System.out.println(s2);

        byte[] bytes = x2.getBytes();
        System.out.println(Arrays.toString(bytes));


        String str = new String(bytes);
        System.out.println(str);

    }
}
