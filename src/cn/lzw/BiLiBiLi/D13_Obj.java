package cn.lzw.BiLiBiLi;

import java.util.Scanner;

/**
 * @author： lzw
 * @date： 2020/12/3 15:48
 * @description：覆写 equals（）方法
 */
/*class Person1 extends Object{
    private String name;
    private int age;

    public Person1 ( String name , int age ) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals ( Object obj ) {
        if(!(obj instanceof Person1)) {
            return false;
        }
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        Person1 p = (Person1) obj;
        return this.name.equals( p.name ) && this.age == p.age;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    @Override
    public String toString ( ) {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class D13_Obj {
    public static void main(String[] args){
        Person1 p1 = new Person1( "颜狗 ",20 );
        Person1 p2 = new Person1( "颜狗",20 );
        System.out.println(p1.equals( p2 ));
    }

}*/
/*class Person {
    private String name;
    private String addr;
    private char sex;
    private int age;

    public Person ( ) {

    }

    public Person ( String name , String addr ) {
        this( name , addr , '男' , 0 );

    }

    public Person ( String name , String addr , char sex , int age ) {
        this.name = name;
        this.addr = addr;
        this.sex = sex;
        this.age = age;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getAddr ( ) {
        return addr;
    }

    public void setAddr ( String addr ) {
        this.addr = addr;
    }

    public char getSex ( ) {
        return sex;
    }

    public void setSex ( char sex ) {
        this.sex = sex;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getInfo ( ) {
        return "姓名：" + this.name + "\t" + "地址：" + this.addr + "\t" + "性别：" + this.sex + "\t" + "年龄：" + this.age;
    }
}

class Student extends Person {
    private double math;
    private double english;

    public Student () {}
    public Student (String name ,String addr){
        super(name,addr);
    }
    public Student (String name ,String addr ,char sex ,int age ,double math ,double english) {
        super(name , addr ,sex ,age );
        this.math = math;
        this.english = english;
    }

    public double getMath ( ) {
        return math;
    }

    public void setMath ( double math ) {
        this.math = math;
    }

    public double getEnglish ( ) {
        return english;
    }

    public void setEnglish ( double english ) {
        this.english = english;
    }

    public String getInfo ( ) {
        return super.getInfo( ) +"\t"+ "数学成绩：" + this.math + "\t" + "英语成绩：" + this.english;
    }


}

public class D13_Obj {
    public static void main ( String[] args ) {
        Student p = new Student();
        p.setName( "颜狗" );
        p.setAge( 20 );
        p.setEnglish( 99 );
        p.setMath( 99 );
        p.setSex( '男' );
        p.setAddr( "郑州" );
        System.out.println( p.getInfo( ) );
    }

}*/

/*
class Employee {
    private String name;
    private int age;
    private char sex;

    public Employee ( String name , int age , char sex ) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String showInfo ( ) {
        return "姓名：" + this.name + "\t" + "年龄：" + this.age + "\t" + "性别：" + this.sex;
    }
}

class Manage extends Employee {
    private String job;
    private double salary;

    public Manage ( String name , int age , char sex , String job , double salary ) {
        super( name , age , sex );
        this.job = job;
        this.salary = salary;
    }

    public String showInfo ( ) {
        return super.showInfo( ) + "\t" + "职务：" + this.job + "\t" + "年薪：" + this.salary;
    }
}

public class D13_Obj {
    public static void main ( String[] args ) {
        Manage M = new Manage( "颜狗" , 20 , '男' , "傻逼" , 1999999.99 );
        System.out.println( M.showInfo( ) );
    }
}*/



//  录入字符串输出指定字符出现的次数
/*
class StringUtil {
    int n = 0;
    int o = 0;

    public StringUtil ( int n , int o ) {
        this.n = n;
        this.o = o;
    }

    public StringUtil ( ) {
        Scanner sc = new Scanner( System.in );
        System.out.print( "请录入字符串：" );
        String str = sc.nextLine( );
        char[] arr = str.toCharArray( );                 //字符串中的数据以字符数组的形式返回
        int[] abc = new int[ 26 ];
        for ( int i = 0 ; i < str.length( ) ; i++ ) {
            char charAt = str.charAt( i );               //获取指定索引位置的字符

            if ( charAt == 'n' || charAt == 'N' ) {
                this.n++;
            }
            if ( charAt == 'o' || charAt == 'O' ) {
                this.o++;
            }
        }
    }

    public String getInfo ( ) {
        return "n出现的次数为：" + this.n + "\n" + "o出现的次数：" + this.o;
    }
}

public class D13_Obj {
    public static void main ( String[] args ) {
        StringUtil su = new StringUtil( );
        System.out.println( su.getInfo( ) );

    }
}*/
