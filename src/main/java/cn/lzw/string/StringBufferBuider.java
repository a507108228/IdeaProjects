package cn.lzw.string;


import org.junit.Test;



/**
 * @author lzw
 * @version 2021/5/20 9:47
 */
public class StringBufferBuider{
    @Test
    public void test01(){
        StringBuffer sb = new StringBuffer();
        sb.append(56789);
        System.out.println(sb);

        sb.append('b');
        System.out.println(sb);

        sb.replace(5,6,"jiujiuguiyi");
        System.out.println(sb);
        sb.append(25.6);
        System.out.println(sb+":::"+sb.length());

        System.out.println(sb.reverse());
        sb.delete(0,4);
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb.insert(0, "io"));
        //    指定字符位置索引
        System.out.println(sb.lastIndexOf("87"));
        //    指定位置的是什么字符
        System.out.println(sb.charAt(1));
        //    输出指定区间的字符 左闭右开
        System.out.println(sb.substring(0, 3));

        System.out.println(sb.codePointAt(0));

        System.out.println(sb.subSequence(0, 3));
    }

}
