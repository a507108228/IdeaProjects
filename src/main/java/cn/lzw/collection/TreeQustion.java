package cn.lzw.collection;

/**
 * @author lzw
 * @version 2021/5/22 9:19
 */

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author: a5071
 * @time: 2021/5/22 9:30
 * <p>
 * 日期类
 */
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate (){
    }

    public MyDate (int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear (){
        return year;
    }

    public void setYear (int year){
        this.year = year;
    }

    public int getMonth (){
        return month;
    }

    public void setMonth (int month){
        this.month = month;
    }

    public int getDay (){
        return day;
    }

    public void setDay (int day){
        this.day = day;
    }

    @Override
    public String toString (){
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

/**
 * @author: a5071
 * @time: 2021/5/22 9:30
 * <p>
 * 员工类
 */

class Employee implements Comparable, Comparator{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee (){
    }

    public Employee (String name, int age, MyDate birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday (){
        return birthday;
    }

    public void setBirthday (MyDate birthday){
        this.birthday = birthday;
    }

    @Override
    public String toString (){
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    /**
     * <p>
     * 按照姓名顺序排列
     */
    @Override
    public int compareTo (Object o){
        if( o instanceof Employee ){
            Employee e = (Employee) o;
            if( this.name.equals(e.name) ){
                return Integer.compare(this.age, e.age);
            } else {
                return this.name.compareTo(e.name);
            }
        }
        throw new RuntimeException("数据有误");
    }

    @Override
    public int compare (Object o1, Object o2){
        return 0;
    }
}


public class TreeQustion{
    /**
     * <p>
     * 使用自然排序
     */
    @Test
    public void test (){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("lzw", 23, new MyDate(1998, 10, 8));
        Employee e2 = new Employee("zy", 23, new MyDate(1998, 3, 21));
        Employee e3 = new Employee("yyw", 22, new MyDate(1999, 10, 5));
        Employee e4 = new Employee("zy", 24, new MyDate(1997, 5, 8));
        Employee e5 = new Employee("cj", 21, new MyDate(2000, 2, 22));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    /**
     * <p>
     * 按照生日排列
     */
    @Test
    public void test1 (){

        Comparator com = new Comparator(){
            @Override
            public int compare (Object o1, Object o2){
                if( o1 instanceof Employee && o2 instanceof Employee ){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    int minusYear = b1.getYear() -b2.getYear();
                    if( minusYear != 0 ){
                        return minusYear;
                    }
                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if( minusMonth != 0 ){
                        return minusMonth;
                    }
                    return b1.getDay() - b2.getDay();
                }
                throw new RuntimeException("error!");
            }
        };

        TreeSet set = new TreeSet<>(com);
        Employee e1 = new Employee("lzw", 23, new MyDate(1996, 10, 8));
        Employee e2 = new Employee("zy", 18, new MyDate(2003, 3, 21));
        Employee e3 = new Employee("yyw", 22, new MyDate(1979, 10, 5));
        Employee e4 = new Employee("zxt", 24, new MyDate(2997, 3, 8));
        Employee e5 = new Employee("cj", 21, new MyDate(2010, 2, 21));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}