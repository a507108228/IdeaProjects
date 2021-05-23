package cn.lzw.collection.Questions;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author lzw
 * @version 2021/5/22 22:18
 *  <p>
 *  2.请把学生名与考试分数录入到集合中，并按分数显示前三名
 *  成绩学员的名字。
 *  TreeSet(Student(name,score,id));
 */

class Students implements Comparable{
    private String name;
    private int age;
    private double mark;

    public Students (){
    }

    public Students (String name, int age, double mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
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

    public double getMark (){
        return mark;
    }

    public void setMark (double mark){
        this.mark = mark;
    }

    @Override
    public String toString (){
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo (Object o){
        if( o instanceof Students ){
            Students su = (Students) o;
                return Double.compare(this.mark,su.mark);
        }
        throw new RuntimeException("error!");
    }
}
public class Question02{

    @Test
    public void test(){
        TreeSet set = new TreeSet();
        Students s1 = new Students("李梓玮",22,99);
        Students s2 = new Students("吴磊",20,110);
        Students s3 = new Students("小哥",102,-89);
        Students s4 = new Students("井柏然",32,112);
        Students s5 = new Students("杨幂",42,134);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);


        Iterator iterator = set.iterator();
        while( iterator.hasNext() ){
            iterator.next();
        }

        //   转成数组 输出前三
        Object[] objects = set.toArray();
        for( int i = 0; i < 3; i++ ){
            System.out.println(objects[i]);
        }


    }
}
