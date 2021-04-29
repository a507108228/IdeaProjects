package cn.lzw.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lzw
 * @version 2021/4/27 14:33
 *          自定义注解
 */

public class TestDemo02{
//    注解没有顺序
    @MyAnnotation2(age = 23 ,id = 01, name = "李梓玮")
    public void test(){ }

    @MyAnnotation3()
    public void text2(){}

}

@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    int age();
    int id();
    String name();
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
//    添加默认注解 上面可以不用赋值
    String school() default "郑州财经学院";

}