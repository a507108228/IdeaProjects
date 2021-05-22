package cn.lzw.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author lzw
 * @version 2021/5/21 19:12
 */
public class ListTest{

    @Test
    public void test (){
        ArrayList list = new ArrayList(10);
        list.add("ab");
        list.add(5);
        list.add(9.8);
        list.add('a');
        list.add('v');
        list.add("jiujiu");
        list.add("guiyi");
        list.add("i miss u");
        System.out.println(list);
        list.add(1, 998);
        System.out.println(list.get(2));

        List< Integer > list1 = Arrays.asList(1, 2, 3);
        list.addAll(2, list1);

        //    移除指定位置的元素 并返回这个元素
        System.out.println(list.remove(2));
        //    指定位置的元素
        list.set(3, 1);
        //    指定位置添加元素 后面的元素往后顺移一位
        list.add(2, 3);
        //    复制指定区间的元素 返回一个新的集合
        List list2 = list.subList(0, 6);
        System.out.println(list2);
        System.out.println(list);

        System.out.println("#############");
        //    迭代器遍历集合
        Iterator iterator = list.iterator();
        System.out.println("迭代器遍历集合：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("#############");
        //    增强for循环
        System.out.println("增强for循环遍历集合：");
        for( Object o : list
        ){
            System.out.println(o);
        }
    }

    @Test
    public void test1(){
        LinkedList list = new LinkedList();
        list.add(125);
        list.add(186);
        list.add(5729);
        list.add(5867);
        list.add(132);
        list.add("liziwei");
        System.out.println(list);

        System.out.println(list.get(5));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //    遍历LinkedList 集合
        for(Object o : list
              ){
            System.out.println(o);

        }
    }
}
