package cn.lzw.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lzw
 * @version 2021/5/22 18:15
 */
public class CollectionsTest{

    @Test
    public void test(){
        List in = new ArrayList();
        in.add(12);
        in.add(21);
        in.add(99);
        in.add(-87);
        in.add(66);
        // System.out.println(in);
        //
        // //    反转
        // Collections.reverse(in);
        // System.out.println(in);
        //
        // //    随机排序
        // Collections.shuffle(in);
        // System.out.println(in);
        //
        // //    指定位置交换
        // Collections.swap(in, 2, 4);
        // System.out.println("交换："+in);
        //
        // //    排序
        // Collections.sort(in);
        // System.out.println(in);
        //
        // //    自然排序 返回最大最小元素
        // System.out.println("集合中最大的元素："+Collections.max(in));
        // System.out.println("集合中最小的元素："+Collections.min(in));

        //    把in中的元素复制到on中
        //    List on = new ArrayList();
        List on = Arrays.asList(new Object[in.size()]);
        Collections.copy(on, in );
        System.out.println(on);

        //    指定集合中 指定元素出现几次
        // int frequency = Collections.frequency(in, 12);
        // System.out.println(frequency);

        //    线程安全的list
        System.out.println(Collections.synchronizedList(in));
    }
}
