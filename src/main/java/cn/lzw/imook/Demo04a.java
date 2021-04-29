package cn.lzw.imook;

/**
 * @author lzw
 * @date 2020/9/13 18:44
 * @description 静态初始化块
 */
public class Demo04a {
    String name;
    String sex;
    static int age;

    public Demo04a(){
        System.out.println("通过构造方法初始化name");
        name = "闫鑫";
    }
    {
        System.out.println("通过初始化块初始化sex");
        sex = "男";
    }static{
        System.out.println("通过静态初始化块初始化age");
        age = 20;
    }
    public void show (){
        System.out.println("姓名："+name+"\n"+ "性别："+ sex +"\n"+"年龄："+ age +"\n");

    }
    public static void main (String [] args){
        Demo04a hello = new Demo04a ();
        hello.show();
        Demo04a hello2 = new Demo04a ();//静态初始化块在类中只执行一次 即便再建一个对象也不会调用

    }


}
