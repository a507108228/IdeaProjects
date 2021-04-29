package cn.lzw.reflection;

/**
 * @author lzw
 * @version 2021/4/27 17:15
 */

class Father{
    static int a = 100;
    static {
        System.out.println("父类初始化");
    }
}

class Son extends Father{
    static int b = 50;
    static final int C = 150;//常量池的常量 位于方法区
    static {
        System.out.println("子类初始化");
    }
}
public class TestDemo3{
    static {
        System.out.println("main 类被加载");
    }
    public static void main(String[] args) throws Exception{
        /**
         * 调用结果
         * main 类被加载
         * 父类初始化
         * 子类初始化
         * 调用子类 但是父类没有初始化 会优先主动调用父类然后才调用子类
         */
//        Son son = new Son();
//        Class c1 = Class.forName("cn.lzw.reflection.Son");

        /**
         main 类被加载
         父类初始化
         100
         子类调用父类 不会产生引用
         */
        System.out.println(Son.a);

    }
}
