package cn.lzw.DemoImooc;

/**
 * @author lzw
 * @date 2020/9/7 11:51
 * @description     调用之前写的类 并给类赋值
 */
public class Demo03a {
    public static void main(String[] args){
     Demo03 phone = new Demo03 ();
     phone.scree = 5.0f;
     phone.cpu = 8.0f;
     phone.mem = 9.0f;
     phone.call ();
     phone.sendMessages ();
    }
}
