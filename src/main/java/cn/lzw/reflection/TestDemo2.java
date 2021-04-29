package cn.lzw.reflection;

/**
 * @author lzw
 * @version 2021/4/27 17:01
 */
class A{


    public A(){
        System.out.println("无参构造初始化");
    }

    static {
        System.out.println("静态代码块初始化");
    }
}
public class TestDemo2{
    public static void main(String[] args){
        A a = new A();

    }

}
