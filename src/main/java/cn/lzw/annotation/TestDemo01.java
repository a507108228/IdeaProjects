package cn.lzw.annotation;

import java.lang.annotation.*;

/**
 * @author lzw
 * @version 2021/4/27 14:02
 * <p>
 * 自定义元注解
 */
@MyAnnotation
public class TestDemo01{
    public void test(){
        System.out.println("注解");
    }

    public static void main(String[] args){
        TestDemo01 td = new TestDemo01();
        td.test();
    }

}

//  定义一个注解 表示注解能用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

//注解生成在Javadoc中
@Documented

//表示注解在什么地方还能用
@Retention(value = RetentionPolicy.RUNTIME)

//子类可以被继承
@Inherited
@interface MyAnnotation{

}
