package cn.lzw.imook;

/**
 * @author lzw
 * @date 2020/9/7 11:36
 * @description 类 属性（特征） 方法（行为）
 */
public class Demo03 {
    float scree;
    float cpu;
    float mem;

    void call(){
        System.out.println("这个手机可以打电话");

    }
    void sendMessages(){
        System.out.println("这个手机可以发信息"+"\n"+"scree: "+scree+"\n"+"cpu: "+cpu+"\n"+"mem: "+mem+"\n");
    }
}
