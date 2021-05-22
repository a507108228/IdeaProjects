package cn.lzw.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;


/**
 * @author lzw
 * @version 2021/5/21 19:46
 * 无序性：按照哈希值排列
 *
 * 不可重复性：new 的对象因为在内存中位置不同
 * 所以 能输出相同的元素 但是实际是没有重复
 * 重写equals 能解决这个问题
 *
 */


class User implements Comparable , Comparator{
    private String name;
    private int age;

    public User (){
    }

    public User (String name, int age){
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo (Object o){
        return 0;
    }

    @Override
    public int compare (Object o1, Object o2){
        return 0;
    }

    @Override
    public boolean equals (Object o){
        if( this == o ) return true;
        if( o == null || getClass() != o.getClass() ) return false;

        User user = (User) o;

        if( age != user.age ) return false;
        return name.equals(user.name);
    }

    @Override
    public int hashCode (){
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}


/**
 *<p> 输出的结果
 *     长度6
 *      99
 *      6
 *      User{name='zhangyu', age=18}
 *      User{name='liziwei', age=18}
 *      58
 *      12
 */
public class SetTest{

    @Test
    public void test(){
        HashSet< Object > integers = new HashSet<>();
        integers.add(12);
        integers.add(58);
        integers.add(06);
        integers.add(99);
        integers.add(99);
        integers.add(new User("liziwei",18));
        integers.add(new User("liziwei",18));
        integers.add(new User("zhangyu",18));

        System.out.println("长度"+integers.size());
        Iterator< Object > iterator = integers.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);

        //    输出结果：99 06 70 58 12 无序 根据数据的hash值排序
        }
    }


    @Test
    public void test2(){
        HashSet set = new HashSet();
        Person p1 = new Person("AA", 1001);
        Person p2 = new Person("BB", 1002);
        set.add(p1);
        set.add(p2);

        p1.setName("CC");
        //    删除p1时 是aa的哈希值 没有找到 所以cc加进去了
        set.remove(p1);

        System.out.println(set);

        //    哈希值不一样 能加进去
        set.add(new Person("CC",1001));
        System.out.println(set);
        //    下面这个对象哈希值是一样的 但是调用equals是 cc 与 aa不一样
        set.add(new Person("AA",1001));
        System.out.println(set);


    }
}
