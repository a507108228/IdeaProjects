package cn.lzw.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author lzw
 * @version 2021/5/21 10:46
 * <p>
 * 1.   数组初始化以后 长度不可变 元素类型不可变
 *      提供的方法有限 效率不高
 * 存储数据特点: 有序 可重复。对于不可重复的需求
 *               无法满足。
 * 2.   集合解决数组存储数据的弊端 数据可以重复 数据不限制类型
 */

class Person{
    private String name;
    private int age;

    public Person (){
    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getAge (){
        return age;
    }

    public void setAge (int age){
        this.age = age;
    }

    @Override
    public String toString (){
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals (Object o){
        if( this == o ) return true;
        if( o == null || getClass() != o.getClass() ) return false;

        Person person = (Person) o;

        if( age != person.age ) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode (){
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}

/**
 * @author: a5071
 * @time: 2021/5/21 15:03
 * <p>
 *      测试集合的各种方法
 */
public class CollectionTest{
    @Test
    public void test1 (){
        Collection arr = new ArrayList();
        arr.add(186);
        arr.add(5729);
        arr.add(5867);
        arr.add(false);
        arr.add(new String("i miss you "));
        arr.add(new Person("zhangyu", 18));
        //    返回包含指定的元素 true or flase
        System.out.println(arr.contains(186));

        //    输出集合
        System.err.println(arr);

    }

    /**
     * 遍历集合
     */
    @Test
    public void test2 (){

        Collection arr = new ArrayList();
        arr.add(186);
        arr.add(5729);
        arr.add(5867);
        arr.add(false);
        arr.add(new String("i miss you "));
        arr.add(new Person("zhangyu", 18));

        for( Object o : arr ){
            System.out.println(o);
        }
        System.out.println("##############");

        //    集合转数组 然后遍历数组 循环输出集合元素
        Object[] s = arr.toArray();
        for( int i = 0; i < s.length; i++ ){
            System.out.println(s[i]);
        }

        System.out.println("哈希值：" + arr.hashCode());
    }

    /**
     * 数组转集合
     */
    @Test
    public void test3 (){

        String[] strings = {"AA", "BB", "CC"};
        List< String > strings1 = Arrays.asList(strings);
        System.out.println("数组转的集合：" + strings1);

    }

    /**
     * 迭代器
     */
    @Test
    public void test4 (){

        List< String > strings1 = Arrays.asList("lm", "qq", "nn", "jiu");
        //    4
        System.out.println(strings1.size());
        List< String > strings = Arrays.asList(new String("abcdefg"),new String("jiujiu"),new String("guiyi"));
        Iterator< String > iterator1 = strings.iterator();
        //    3
        System.out.println(strings.size());
        while (iterator1.hasNext()){
            Object o = iterator1.next();
            if( "jiujiu".equals(o) ){
                System.out.println(iterator1.next());
            }
        }


        List< Integer > integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("集合里添加元素 都是单一元素：" + integers);

        //    Iterator 迭代器 遍历集合元素
        Iterator< Integer > iterator = integers.iterator();

        //    笨方法  一次输出一个
        System.out.println(iterator.next());

        //    推荐的方式
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //    错误的方式 每一次都重新生成一个迭代器 一直输出第一个元素
        //    成死循环了
/*        while (integers.iterator().hasNext()){
            System.out.println(integers.iterator().next());
        }*/
    }

    @Test
    public void test6(){
         Collection strings = new ArrayList();
         strings.add("mn");
         strings.add("xyz");
         strings.add("qq");
         strings.add("abc");
        Iterator iterator1 = strings.iterator();

        while (iterator1.hasNext()){
            Object next = iterator1.next();
            if( "xyz".equals(next)){
                iterator1.remove();
            }
        }
        System.out.println("删除xyz后的集合："+strings);

         iterator1 = strings.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }

    @Test
    public void test7(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);
        System.out.println(coll.remove(123));
        //    删除集合中"Tom"
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if("Tom".equals(obj)){
                iterator.remove();
            }

        }
        //    遍历集合
        iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}