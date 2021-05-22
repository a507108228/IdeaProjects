package cn.lzw.collection;

import org.junit.Test;

import java.util.*;


/**
 * @author lzw
 * @version 2021/5/22 14:43
 */

public class MapTest{

    @Test
    public void test (){
        Map map = new HashMap();
        map.put(1, 9);
        // 一个k 只能对应一个 v  ； 一个v 可以有多个 k
        //    (1，3) 覆盖了 （1，2）
        map.put(1, 3);
        map.put(-1, 2);
        map.put(2, 8);
        map.put(0, 7);
        map.put(9, 6);
        map.put("string", "s");

        System.out.println("键1 的值：" + map.get(1));

        Map ab = new HashMap();
        ab.putAll(map);
        System.out.println("putAll()方法:" + ab);

        System.out.println("entrySet:" + map.entrySet());
        System.out.println("k集合" + map.keySet());
        System.out.println("map:" + map);

        System.out.println("-------------");


        //    key - value 构成的集合 遍历出来
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("遍历k-v：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------");


        //    遍历k
        Set set1 = map.keySet();
        Iterator iterator1 = set1.iterator();
        System.out.println("遍历k的值：");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("-------------");


        //    遍历value
        Collection values = map.values();
        System.out.println("遍历values：");
        for( Object obj : values
        ){
            System.out.println(obj);
        }

        //    遍历k找v
        Set set2 = map.keySet();
        Iterator iterator2 = set1.iterator();
        System.out.println("遍历k的值找v:");
        while (iterator2.hasNext()) {
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println("键：" + key + "  ---  " + "值：" + value);
        }
        System.out.println("-------------");
    }


    @Test
    public void test2(){
        TreeMap treeMap = new TreeMap(new Comparator(){
            @Override
            public int compare (Object o1, Object o2){
                if( o1 instanceof User && o2 instanceof User ){
                    User u1 = (User) o1;
                    User u2 = (User) o2;

                    if( u1.getName().equals(u2.getName()) ){
                        return Integer.compare(u1.getAge(),u2.getAge());
                    }else {
                        return u1.getName().compareTo(u2.getName());
                    }
                }
                throw new RuntimeException("error!!!");
            }
        });

        User t1 = new User("lilei", 19);
        User t2 = new User("hanmei", 16);
        User t3 = new User("xiaoming", 18);
        User t4 = new User("wangfang", 17);
        User t5 = new User("zhaoyu", 12);

        treeMap.put(t1,85);
        treeMap.put(t3,67);
        treeMap.put(t4,99);
        treeMap.put(t5,100);
        treeMap.put(t2,88);

        Set set = treeMap.entrySet();

        System.out.println("遍历键值对：");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
