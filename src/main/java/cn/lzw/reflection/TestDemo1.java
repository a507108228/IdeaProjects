package cn.lzw.reflection;

import java.lang.annotation.ElementType;

/**
 * @author lzw
 * @version 2021/4/27 14:55
 * 
 */
//实体类 entity
class User{
    private String name;
    private int id;
    private int age;

    public User(){
    }

    public User(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
public class TestDemo1{
    public static void main(String[] args) throws Exception{
        Class aClass = Class.forName("cn.lzw.reflection.User");
        //System.out.println(aClass);

        System.out.println(aClass.getName());

        Class<Object> c1 = Object.class;
        Class<Comparable> c2 = Comparable.class;
        Class<String[]> c3 = String[].class;
        Class<int[][]> c4 = int[][].class;
        Class<Override> c5 = Override.class;
        Class<ElementType> c6 = ElementType.class;
        Class<Integer> c7 = Integer.class;
        Class<Void> c8 = void.class;
        Class<Class> c9 = Class.class;


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);


    }

}
